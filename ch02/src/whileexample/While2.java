package whileexample;

public class While2 {

	public static void main(String[] args) {
		// while문 - 반복 조건문(if ~ break)
		int i = 0;
		int sumV = 0;
		
		while(true) {
			i++;
			if(i > 10) {  //i = 11 일때 break 실행
				break;
			}
			sumV += i;
			System.out.println(i);
		}
		System.out.println("합계: " + sumV);
	}

}
