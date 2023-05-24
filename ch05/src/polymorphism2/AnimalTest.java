package polymorphism2;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

//Human 클래스 ------------------------------
class Human extends Animal {
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
}

//Tiger 클래스 -------------------------------
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 움직입니다.");
	}
}

//Eagle 클래스 -------------------------------
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 날아갑니다.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		//부모타입으로 객체를 생성
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle(); 
		
		aTest.moveAnimal(human);
		aTest.moveAnimal(tiger);
		aTest.moveAnimal(eagle);
	}
	
	//move()를 사용할 메서드 생성 - 매개변수의 다양성
	public void moveAnimal(Animal animal) {
		animal.move();
	} 

}
