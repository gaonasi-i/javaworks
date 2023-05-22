package methods;

public class OneUp {
	
	//숫자 1이 증가하는 함수
	public static int oneUp() {
		//x는 값을 반환한 후에 소멸
		int x = 0;
		x = x + 1;
		return x;
	}
	public static void main(String[] args) {
		System.out.println(oneUp());
		System.out.println(oneUp());
		
		//x 값 확인
		//x는 변수 할당을 하지 않아서 컴파일 오류(실행전 오류)
		int x = 0;
		System.out.println(x);
	}

}
