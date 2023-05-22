package methods;

public class OneUp2 {
	
	//static이 붙으면 변수는 정적변수이다
	//정적 변수는 프로그램이 종료되면 값이 소멸하고, 값을 계속 유지
	//static 변수
	static int x = 0;
	
	//static() 함수
	public static int oneUp() {
		x = x + 1;
		return x;
	}
	public static void main(String[] args) {
		System.out.println(oneUp());
		System.out.println(oneUp());
		
		//x 값 확인
		System.out.println("x = " + x);

	}

}
