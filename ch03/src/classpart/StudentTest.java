package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// Student 클래스 사용
		Student s1 = new Student();
		//System.out.println(s1);
		
		s1.studentID = 100;
		s1.studentName = "이가은";
		
		System.out.println(s1.studentID);
		System.out.println(s1.studentName);
		
		s1.ShowInfo();
		
	}

}
