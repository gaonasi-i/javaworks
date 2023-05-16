package constant;

public class Constant1 {

	public static void main(String[] args) {
		// 상수(변하지 않는값) 선언하기 - final 키워드를 붙이면 상수가 됨 
		// 상수는 수정할수 없음(재할당 불가), 관례상 대문자로 사용함
		
		final int MAX_NUM = 100;
		
		// maxNum = 200;
		
		//System.out.println(MAX_NUM);
		
		// 상수 활용하기 - 원의 넓이 계산
		int radius = 5;           // 반지름 5
		final double PI = 3.14;   // 3.14파이
		double area;
		
		area = radius * radius * PI;
		
		System.out.printf("원이 넓이는 %.2f입니다.", area);  // %.2f 소수 2째자리까지 출력
		
		

	}

}
