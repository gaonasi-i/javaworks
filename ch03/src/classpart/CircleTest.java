package classpart;

public class CircleTest {
	
	public static void main(String[] args) {
		//원 객체를 생성
		Circle c1 = new Circle(3, 4, 5);
		Circle c2 = new Circle(10, 15, 20);
		
//		System.out.printf("원의 중심은 (%d, %d)이고, 반지름은 %dcm입니다.\n",
//				c1.center.x, c1.center.y, c1.redius);
//		System.out.printf("원의 중심은 (%d, %d)이고, 반지름은 %dcm입니다.\n",
//				c2.center.x, c2.center.y, c2.redius);
		
		//출력부분을 함수로 Circle클래스에서 생성해 함수로 호출
		c1.showInfo();
		c2.showInfo();
	}
}
