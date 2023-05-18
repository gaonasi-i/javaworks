package classpart;


// public - 접근 제어자
public class Student {
	//클래스의 3요소 - 멤버변수, 생성자, 메서드
	//생성자(Constructor)는 반환형이 없고, 클래스이름과 같다.
	int studentID;         //학번
	String studentName;    //이름
	
	public Student() {}    //기본 생성자
	
	//매개변수가 있는 생성자(생성자 오버로딩: 여러가지 자료형과 변수들이 있음)
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	//void(비어있는)형 : return값이 없다 = 자료형이 없다
	public void ShowInfo() {
		System.out.println("학번: " + studentID + ", 이름: " + studentName);
	}
}
