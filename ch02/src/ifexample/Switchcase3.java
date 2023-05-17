package ifexample;

public class Switchcase3 {
	public static void main(String[] args) {
		 //operator 값이 +, -, *, / 인 경우에 사칙연산을 수행하는 프로그램
		double num1 = 21;
		double num2 = 15;
		char operator = '+';
		double result = 0; // 결과값을 실수로 저장하고 if문으로 정수로 출력
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("연산자 오류입니다.");
			return;
		}		
		
		  // 결과 값이 정수인 경우 정수로 형변환하여 출력
        if (result % 1 == 0) { 
            System.out.println("결과 값은 " + (int)result + "입니다.");
        }else {
            System.out.println("결과 값은 " + result + "입니다.");
        }
    }

}
