package classpart;

public class Number {
	
	int x;   //클래스 안의 변수(멤버 변수)
	
	public Number() {   //생성자
		x = 4;
	}
	
	//public Number(int y) {  //매개변수가 있는 생성자
	//	x = y;
	//}
	
	public Number(int x) {  
		//외부에서 입력한 변수와 멤버변수 이름을 같은 이름으로 사용할때 tihs키워드 사용
		this.x = x;
	}
	
	public static void main(String[] args) {
		//기본생성자로 생성한것
		Number myObj = new Number();
		System.out.println(myObj.x);
		
		//매개변수가 있는 생성자로 생성
		Number myObj2 = new Number(4);
		System.out.println(myObj2.x);
		
	}

}
