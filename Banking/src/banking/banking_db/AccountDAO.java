package banking.banking_db;

import java.util.Scanner;

import banking.banking_db.common.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccountDAO {
	//전역 변수
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	Scanner sc = new Scanner(System.in);
	
	//계좌를 생성하는 함수
	public void createAccount() {
		System.out.println("-----------------------------------------");
		System.out.println("    ♣ 아래의 입력란에 정보를 입력해주세요. ♣");
		System.out.println("-----------------------------------------");
		
		while(true) {
			System.out.print("계좌번호: ");
			String ano = sc.nextLine();
			
			//첫번째 계좌 생성
			//accountArray[0] = new Account(ano, owner, belance);
			if(findAccount(ano) != null) {
				System.out.println("중복계좌 입니다. 다시 확인해주세요.");
			}else {
				System.out.print("계좌주　: ");
				String owner = sc.nextLine();
				
				System.out.print("초기입금액: ");
				int balance = Integer.parseInt(sc.nextLine());
				
				conn = JDBCUtil.getConnection();
				String sql = "INSERT INTO account(ano, owner, balance) VALUES(?, ?, ?)";
				
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, ano);
					pstmt.setString(2, owner);
					pstmt.setInt(3, balance);
					pstmt.executeUpdate();
					System.out.println("계좌가 생성되었습니다.");
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JDBCUtil.Close(conn, pstmt);
				}
				break;  //계좌를 생성하고 빠져나옴
			}
		}//while 끝
	}
		
	//계좌 목록을 출력하는 함수
	public void getAccountList() {
		System.out.println("-----------------------------------------");
		System.out.println("             ♣ 계좌 목록 ♣");
		System.out.println("-----------------------------------------");
		
		ArrayList<Account> accountList = new ArrayList<>();
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {   //자료가 있으면 계속 반복
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				Account account = new Account(ano, owner, balance);
				accountList.add(account);
			}
			//화면에 출력
			for(int i=0; i<accountList.size(); i++) {
				Account account = accountList.get(i);  //자료를 가져와서 저장
				
				System.out.print("계좌번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔고: " + account.getBelance());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.Close(conn, pstmt, rs);
		}

	}

	//계좌에 입금하는 메서드
	public void deposit() {
		System.out.println("-----------------------------------------");
		System.out.println("       ♣ 예금할 계좌와 금액을 입력해주세요 ♣");
		System.out.println("-----------------------------------------");
		
		while(true) {
			System.out.print("계좌번호: ");
			String ano = sc.nextLine();
			
			if(findAccount(ano) != null) {
				System.out.print("입금액　: ");
				int money = Integer.parseInt(sc.nextLine());
				
				Account account = findAccount(ano);  //입력한 계좌를 가져옴
				String owner = account.getOwner();
				int balance = account.getBelance() + money;
				
				conn = JDBCUtil.getConnection();
				String sql = "UPDATE account SET owner = ?, balance = ? WHERE ano = ?";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, owner);
					pstmt.setInt(2, balance);
					pstmt.setString(3, ano);
					pstmt.executeUpdate();    //db에 저장
					System.out.printf("%,d원 정상 입금되었습니다.\n", money);
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JDBCUtil.Close(conn, pstmt);
				}
				break;	
			}else {
				System.out.println("계좌가 없습니다. 다시 입력해주세요.");
			}
		}
	}
	
	//계좌에서 출금하는 메서드
	public void withdraw() {
		System.out.println("-----------------------------------------");
		System.out.println("       ♣ 출금할 계좌와 금액을 입력해주세요 ♣");
		System.out.println("-----------------------------------------");
		
		while(true) {
			System.out.print("계좌번호: ");
			String ano = sc.nextLine();
			
			if(findAccount(ano) != null) {    	
				while(true) {
					System.out.print("출금액　: ");
					int money = Integer.parseInt(sc.nextLine());
					
					Account account = findAccount(ano);
					String owner = account.getOwner();
					int balance = account.getBelance() - money;
	
					if(money > account.getBelance()) {
						System.out.println("잔액이 부족합니다. 다시 확인해주세요.");
					}else {
						conn = JDBCUtil.getConnection();
						String sql = "UPDATE account SET owner = ?, balance = ? WHERE ano = ?";
						try {
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, owner);
							pstmt.setInt(2, balance);
							pstmt.setString(3, ano);
							pstmt.executeUpdate();    //db에 저장
							System.out.printf("%,d원 정상 출금되었습니다.\n", money);
						} catch (SQLException e) {
							e.printStackTrace();
						}finally {
							JDBCUtil.Close(conn, pstmt);
						}
						break;
					}
				}//내부 while 끝
				break;
			}else {
				System.out.println("계좌가 없습니다. 다시 입력해주세요.");
			}
		}
	}
	
	//계좌를 검색하는 메서드
	public Account findAccount(String ano) {
		Account account = null;       
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account WHERE ano = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				account = new Account(ano, owner, balance);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.Close(conn, pstmt, rs);
		}
		return account;	
	}
	
	//계좌를 삭제하는 메서드
	public void deleteAccount() {
		System.out.println("-----------------------------------------");
		System.out.println("       ♣ 삭제할 계좌번호를 입력해주세요 ♣");
		System.out.println("-----------------------------------------");
		
		while(true) {
			System.out.print("계좌번호: ");
			String ano = sc.nextLine();
				
				if(findAccount(ano) != null) {
					conn = JDBCUtil.getConnection();
					String sql = "DELETE FROM account WHERE ano = ?";
					try {
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, ano);
						pstmt.executeUpdate();
						System.out.println("계좌를 삭제하였습니다.");
					} catch (SQLException e) {
						e.printStackTrace();
					}finally {
						JDBCUtil.Close(conn, pstmt);
					}
					break;
				}else {
					System.out.println("잘못된 계좌입니다. 다시 입력해 주세요.");
				}
		}			
	}
} //DAO클래스 끝
