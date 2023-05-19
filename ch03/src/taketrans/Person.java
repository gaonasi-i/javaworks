package taketrans;

public class Person {
	//맴버변수
	String name;
	int age;
	int money;
	
	//생성자 - 같은 패키지 안에 있어서 public이 생략
	//this는 생성자가 아니더라도 메서드에서 사용 가능
	Person(String name ,int money) {
		this.name = name;
		this.money = money;
	}
	//버스를 타는 기능을 하는 메서드
	//매개변수 - 자료형 변수이름 (사용자가 Bus를 자료형으로 만들어서 넣을수도있다)
	//new를 사용하여 만드는 객체생성을 간소화 했다고 생각하면 됨
	void takeBus(Bus bus) {
		bus.take(1300);       //1300원 매게로 전달
		this.money -= 1300;   //1300원 적립
	};
	
	void takeline(Subway line) {
		line.take(1250);       //1250원 매게로 전달
		this.money -= 1250;   //1250원 적립
	};
	
	
	//사람의 정보
	void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d원입니다.\n",
				name, money);
	};
}
