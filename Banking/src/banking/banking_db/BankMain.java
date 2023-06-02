package banking.banking_db;

import java.util.Scanner;

public class BankMain {
	
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.삭제 | 6.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			
			//선택 메뉴 변수
			int selectNo = Integer.parseInt(sc.nextLine());  //문자형을 숫자형으로 변환
			
			if(selectNo == 1) {           //계좌 생성
				dao.createAccount();
			}else if(selectNo == 2){      //계좌 목록
				dao.getAccountList();
			}else if(selectNo == 3){      //예금
				dao.deposit();
			}else if(selectNo == 4){      //출금
				dao.withdraw();
			}else if(selectNo == 5){      //계좌 삭제
				dao.deleteAccount();
			}else if(selectNo == 6){
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요.");
			}
		}//while
		sc.close();
	}//main()
	
}//Main클래스 끝
