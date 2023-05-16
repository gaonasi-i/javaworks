package var;

public class IntLongType {

	public static void main(String[] args) {
		 // int - 4byte : 32bit (-21억 ~ 21억)
		 int iNum = 1234567890;
		 
		 // long - 8byte : 64bit / long 자료형은 int와 구분하기 위해 끝에 'L', 'l'을 붙힘
		 long jNum = 12345678900L;
		 
		/*
		 * int iNum = 12345678900;
		 * The literal 12345678900 of type int is out of range 
		 * 21억을 초과하면 에러 발생  
		 */
		
		System.out.println("int형 :" + iNum);
		System.out.println("long형 :" + jNum);

	}

}
