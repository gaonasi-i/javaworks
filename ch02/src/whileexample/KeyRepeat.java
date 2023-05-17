package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// "y"키 - "계속 반복", "n"키 - "반복 중단", 이외의 키 - "지원하지 않는 키 출력"
		// 문자를 비교하는 함수 : .equals() 메서드 사용 / key == 'y' (문자 비교x, 숫자 비교o) 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("계속 반복할까요?(y/n)");
			String key = sc.nextLine();  //String형이므로 쌍따옴표로 사용
			// scanner는 char매게변수가 없기때문에 string으로 사용
			
			if(key.equals("y") || key.equals("Y")) {
				System.out.println("계속 반복");
			}else if(key.equals("n") || key.equals("N")) {
				System.out.println("반복 중단");
				break;
			}else {
				System.out.println("지원하지 않는 키 입니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}	

}
