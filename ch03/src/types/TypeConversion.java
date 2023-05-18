package types;

public class TypeConversion {
	public static void main(String[] args) {
		//형변환
		//목시적 형변환(자동 형변환)
		int iNum = 20;
		float fNum = iNum;
		
		System.out.println(iNum);   //20
		System.out.println(fNum);   //20.0
		
		double dNum;   // 8byte 실수형
		dNum = iNum + fNum;  
		
		System.out.println(dNum);  //40.0
		
		//명시적 형변환(강제 형변환)
		double dNum1 = 1.2;
		float fNum2 = 0.9f;   //f를 붙히는 이유: java는 실수를 double로 자동 형변환 하기때문에 f를써줘야 한다.
		
		int iNum2 = (int)dNum1 + (int)fNum2;  
		int iNum3 = (int)(dNum1 + fNum2);
		
		System.out.println(iNum2);   // 1+0=1  자료형의 괄호 위치에따라 결과값이 다름 'ㅅ'
		System.out.println(iNum3);   // 1.2+0.9=2.1 이지만 int로 0.1소실
		
	}
	
}
