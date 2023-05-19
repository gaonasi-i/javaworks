package classpart;

public class PointTest {

	public static void main(String[] args) {
		//Point 클래스의 객체 생성(불러오기)
		Point point1 = new Point(3, 4);
		Point point2 = new Point(10, 15);
		
		//point1.x = 3;  
		//point1.y = 4; 
		
		System.out.println("점(" + point1.x + ", " + point1.y +  ")" );
		System.out.println("점(" + point2.x + ", " + point2.y +  ")" );

	}

}
