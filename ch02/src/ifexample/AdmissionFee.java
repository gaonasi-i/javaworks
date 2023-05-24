package ifexample;

import java.util.Scanner;

public class AdmissionFee {

	public static void main(String[] args) {
		// 놀이공원 입장료 계산
		// 나이별 - 8세 미만 1000원, 14세 미만 2000원, 20세 미만 2500원, 20세이상 3000
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			try {
				
				System.out.print("나이를 입력해 주세요: ");
				String age = sc.nextLine();
				int fee = 0;  //입장료를 0으로 초기화
				
				if(Integer.parseInt(age) < 8){
					fee = 1000;
					System.out.println("취학 전 아동입니다.");
					
				}else if(Integer.parseInt(age) < 14) {      //age >= 8 && age < 14
					fee = 2000;
					System.out.println("초등학생 입니다.");
					
				}else if(Integer.parseInt(age) < 20) {      //age >= 14 && age < 20
					fee = 2500;
					System.out.println("중,고등학생 입니다.");
		
				}else{
					fee = 3000;
					System.out.println("일반인 입니다.");
					
				}
				System.out.printf("입장료는 %,d원 입니다.\n", fee);
				
			
			
			
				System.out.print("계속 하시려면 Y(y) 아니면 N(n): ");
				String text = sc.nextLine();
				
				if(text.equalsIgnoreCase("Y")) {
					continue;
				}else if(text.equalsIgnoreCase("N")) {
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.print("계속 하시려면 Y(y) 아니면 N(n): ");
					continue;
				}
			}catch(NumberFormatException e) {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			
			
			
			
		}

	}
}
