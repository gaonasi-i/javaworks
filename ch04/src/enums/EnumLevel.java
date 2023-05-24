package enums;

//외부에서 호출 하지 않아도 클래스로 위에 직접 만들수있음
//열거형 상수
enum Level{
	LOW,
	MEDIUM,
	HIGH
}

public class EnumLevel {

	public static void main(String[] args) {
		Level level = Level.HIGH;
		
		switch(level) {
		case LOW: System.out.println("Low Level"); break;
		case MEDIUM: System.out.println("Medium Level"); break;
		case HIGH: System.out.println("High Level"); break;
		default: System.out.println("레벨이 없습니다.");
		}

	}

}
