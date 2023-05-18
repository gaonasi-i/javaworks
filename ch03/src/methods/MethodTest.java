package methods;

//MethodEx인 서브클래스 생성
class MethodEx{
	//sayHello()함수 생성
	public void sayHello() {
		System.out.println("Hello");
	}
	//이름이 매개변수인 sayHello() 함수 작성
	public void sayHello2(String name) {
		System.out.println("Hello! " + name);
	}
	
	public int add(int x, int y) {
		return x + y;
	}
}

public class MethodTest {

	public static void main(String[] args) {
		// 메인 클래스에 서브클래스 호출하기
		// new로 패키지(객체) 생성해서 불러오기
		MethodEx method = new MethodEx();
		method.sayHello();
		
		int value = method.add(10, 20);
		System.out.println(value);
		
		method.sayHello2("가은!");
		method.sayHello2("민정!");
		
		
	}

}
