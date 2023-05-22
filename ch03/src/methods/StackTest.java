package methods;

public class StackTest {
	public static void main(String[] args) {
		// static 함수를 호출(new 사용 안함)
		// sum = 메인함수에 있는 지역변수
		int sum = add(10, 11);               //add 호출
		System.out.println(sum);
	}
	    //int - 반환자료형
	public static int add(int n1, int n2) {  
		//n1, n2 = 메개변수
		//result = 지역변수
		int result = n1 + n2;
		return result;
	}
}
