package operator;

public class Operator2 {

	public static void main(String[] args) {
		//비교연산: >, <, ==, !=
		int num1 =7, num2 = 3;
		
		System.out.println(num1 > num2);   
		System.out.println(num1 < num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		//논리연산
		/* &&: 논리곱(비교대상 모두 참이면 참)
		 * ||: 논리합(비교대산 둘장 하나만 참이면 참)
		 * ! : 논리부정(비교조건이 참이면 거짓, 거짓이면 참)
 		 */ 
		
		System.out.println((num1 < num2)&&(num1 != num2));   //true && false = false 
		System.out.println((num1 < num2)||(num1 != num2));   //true || false = true 
		System.out.println(!(num1 != num2));                 //!true = false
		
	}

}