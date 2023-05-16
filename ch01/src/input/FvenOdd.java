package input;

import java.util.Scanner;

public class FvenOdd {

	public static void main(String[] args) {
		// 숫자를 입력받아 홀수/짝수를 판별하는 프로그램
		// 프로그램 실행시에 오류가 나는것 - 예외(Exception)
		// try ~ catch 구문
		try{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자 입력: ");
			int num = sc.nextInt();
			
			//String evenOdd = (num%2 == 0 ) ? "짝수입니다." : "홀수입니다." ;
			// String인 이유: 결과가 문자열 이라서(결과를 보고 자료형 만들기)
			
			// if문으로 만들기
			String evenOdd = ""; //결과값을 빈문자열("")로 변수에 담기
			if(num%2 == 0) {
				evenOdd = "짝수입니다.";
			}else {
				evenOdd = "홀수입니다.";
			}
			
			System.out.println(evenOdd);
			
			sc.close();
			
		}catch(Exception e) {   //e는 사용자가 지정한 변수
			System.out.print("숫자를 입력해주세요.");
		}
	}

}
