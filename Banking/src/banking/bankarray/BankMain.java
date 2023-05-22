package banking.bankarray;

import java.util.Scanner;

public class BankMain {
	// 통장계좌를 만들 객체 배열 100개 생성
	static Account[] accountArray = new Account[100];
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
			}
			else if(selectNo == 5){
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
		
		System.out.print("계좌번호: ");
		String ano = sc.nextLine();
		
		System.out.print("계좌주　: ");
		String owner = sc.nextLine();
		
		System.out.print("초기입금액: ");
		int belance = Integer.parseInt(sc.nextLine());
		
		//첫번째 계좌 생성
		//accountArray[0] = new Account(ano, owner, belance);
		for(int i=0; i<accountArray.length; i++) {               //전체 배열을 반복하면서
			if(accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, belance);  //계좌를 생성함
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
		
	}
	//계좌 목록을 출력하는 함수
	private static void getAccountList() {
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {                        //배열의 요소가 null이 아닌경우 출력
				Account account = accountArray[i];  
				System.out.println("계좌번호: " + account.getAno());
				System.out.println("계좌주　: " + account.getOwner());
				System.out.println("잔고　　: " + account.getBelance());
				System.out.println();
			}
		}
	}

}//Main클래스 끝
