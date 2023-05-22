package statics;

public class Student {
	private static int serialNum  = 1000;
	private int studentId;   //학번
	private String name;     //이름
	
	Student(){                  //기본 생성자
		serialNum ++;           //serial에 1을 증가
		studentId = serialNum;  //증가한 번호를 학번에 저장
	}              
	
	//get(), set()
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	// -------------------------------
	
	int getStudentId() {                  //입력개념
		return studentId;
	}
	void setStudentId(int studentId) {    //출력개념
		this.studentId = studentId;
	}
}
