package ifexample;

public class IfOperator {
	public static void main(String[] args) {
		 //operator 값이 +, -, *, / 인 경우에 사칙연산을 수행하는 프로그램
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		double result = 0; 
	
		if(operator == '+') {
			result = num1 + num2;
		}else if(operator == '-') {
			result = num1 - num2;
		}else if(operator == '*') {
			result = num1 * num2;
		}else if(operator == '/') {
			result = num1 / num2;
		}else {
			System.out.println("연산자 오류입니다.");
		}
		
		System.out.println("결과값은 " + result + "입니다.");
        }
    }

