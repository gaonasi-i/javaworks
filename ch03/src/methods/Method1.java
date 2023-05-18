package methods;

public class Method1 {
	
	//main()함수
	public static void main(String[] args) {
		//객체(클래스에서 만드는 인스턴스) - 메모리에 로딩
		Method1 method = new Method1();
		//클래스 이름(주소) - 패키지이름.클래스이름@16진수
		System.out.println(method);
		
		//함수 호출
		sayHello();
		System.out.println(square(3));
	}
	
	//sayHello() 함수 생성(return이 없는 함수:void)
	//객체를 new 하지 않으면 static을 붙혀야한다.
	//static을 쓰는 이유: 메모리의 정적영역(값을 누적, 공유) | 호출하는쪽에서 new객체 생성을 하지않을때 사용
	public static void sayHello() {
		System.out.println("Hello!");
	}
	
	//제곱수를 계산하는 함수(return이 있는 함수:자료형(int등등))
	public static int square(int x) {
		return x * x;
	}

}
