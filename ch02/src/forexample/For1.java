package forexample;

import java.util.Scanner;

public class For1 {
	public static void main(String[] args) {
		// 1부터 10까지 출력, 합계
		
		int sumV = 0; // 합계를 저장할 변수
		
		for(int i=1; i<=10; i++) {
			sumV += i;
			System.out.println("i=" + i + ", 합계=" + sumV);
	}
	System.out.println("합계:" + sumV);
	
	//문자세트 - 영어 알파벳 출력(대문자, 소문자)
	char ch;
	for(ch=65; ch<123; ch++) {
		System.out.println(ch + " ");
	}
	System.out.println();
	
	//유니코드 - 한글 출력
	for(ch=12593; ch<12686; ch++) {
		System.out.println(ch + " ");
	}
	
	//구구단
	Scanner sc = new Scanner(System.in);
	
	System.out.print("단을 입력하세요:");   // 출력 제발... 변수위에 올려... 실수하즤마...
	int dan = sc.nextInt();
	
	for(int i=1; i<=9; i++) {
		System.out.println(dan + "x" + i + "=" + (dan * i));
	}
	
	}
}
