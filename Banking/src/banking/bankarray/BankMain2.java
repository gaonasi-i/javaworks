package banking.bankarray;

import java.util.Scanner;

public class BankMain2 {
	// 통장계좌를 만들 객체 배열 100개 생성
	static Account[] accountArray = new Account[100];  //전역 배열
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");
			
			//선택 메뉴 변수
			int selectNo = Integer.parseInt(sc.nextLine());  //문자형을 숫자형으로 변환
			
			if(selectNo == 1) {           //계좌 생성
				createAccount();
			}else if(selectNo == 2){      //계좌 목록
				getAccountList();
			}else if(selectNo == 3){      //예금
				deposit();
			}else if(selectNo == 4){      //출금
				withdraw();
			}else if(selectNo == 5){
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요.");
			}
		}//while

	}//main()
	
	//계좌를 생성하는 함수
	private static void createAccount() {
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
				int belance = Integer.parseInt(sc.nextLine());
				
				for(int i=0; i<accountArray.length; i++) {                   //전체 배열을 반복하면서
					if(accountArray[i] == null) {                            //계좌가 생성되지 않은 인덱스에
						accountArray[i] = new Account(ano, owner, belance);  //계좌를 생성함
						System.out.println("계좌가 생성되었습니다.");
						break;
					}
				}
				break;  //계좌를 생성하고 빠져나옴
			}
		}//while 끝
		
	}
		
	//계좌 목록을 출력하는 함수
	private static void getAccountList() {
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {            //배열의 요소가 null이 아닌경우 출력
				Account account = accountArray[i];  
				System.out.print("계좌번호: " + account.getAno() + "\t");
				System.out.print("계좌주: " + account.getOwner() + "\t");
				System.out.println("잔고: " + account.getBelance());
			}
		}
	}
	
	//계좌에 입금하는 메서드
	private static void deposit() {
		System.out.println("-----------------------------------------");
		System.out.println("       ♣ 예금할 계좌와 금액을 입력해주세요 ♣");
		System.out.println("-----------------------------------------");
		
		while(true) {
			System.out.print("계좌번호: ");
			String ano = sc.nextLine();
			
			if(findAccount(ano) != null) {
				System.out.print("입금액　: ");
				int money = Integer.parseInt(sc.nextLine());
				
				if(findAccount(ano) != null) {      //계좌를 찾았다면(반환값이 있다면)
					Account account = findAccount(ano);
					//예금 -> 원래있던 잔고+입금액
					account.setBelance(account.getBelance() + money);
					System.out.println("정상 처리 되었습니다.");
					break;
				}
			}else {
				System.out.println("계좌가 없습니다. 다시 입력해주세요.");
			}
		}
	}
	
	//계좌에서 출금하는 메서드
	private static void withdraw() {
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
					if(money > account.getBelance()) {
						System.out.println("잔액이 부족합니다. 다시 확인해주세요.");
						
					}else {
						//예금 -> 원래있던 잔고-입금액
						account.setBelance(account.getBelance() - money);
						System.out.println("정상 처리 되었습니다.");
						break;
					}
				}
				break;
			}else {
				System.out.println("계좌가 없습니다. 다시 입력해주세요.");
			}
		}
	}
	
	//계좌를 검색하는 메서드
	private static Account findAccount(String ano) {
		Account account = null;                           //빈계좌 계정을 선언
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {                 //없는 계좌를 못찾으면 null 예외 발생
				String dbAno = accountArray[i].getAno();  //이미 저장된 계정
				if(dbAno.equals(ano)) {                   //문자열 비교 - equals() 사용
					account = accountArray[i];
					break;                                //빠져나오깅
				}	
			}
		}
		return account;
	}

}//Main클래스 끝
