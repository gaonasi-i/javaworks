package arraylist.scorelist;

public class Student {
	//field 필드(멤버 변수)
	int studentId;       //학번
	String studentName;  //이름
	Subject korean;      //과목 - 국어
	Subject math;        //과목 - 영어
	
	//생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;		
		korean = new Subject();
		math = new Subject();
	}
	
	//국어 성적을 입력하는 메서드
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	//수학 성적을 입력하는 메서드
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	//학생 정보 출력
	public void showInfo() {
		System.out.printf("학생 %s의 국어 성정은 %d점 이고, 수학점수는 %d점 입니다.\n",
				studentName, korean.getScorePoint(), math.getScorePoint());
	}
}
