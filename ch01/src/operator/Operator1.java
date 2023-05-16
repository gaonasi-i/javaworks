package operator;

public class Operator1 {

	public static void main(String[] args) {
		// 영어, 수학과목의 총점과 평균
		// 변수(입력)
		int engScore = 90;
		int matScore = 85;
		int totalScore;
		double avgScore;  // 8byte 실수형 자료형
		
		// 총점과 평균 계산
		totalScore = engScore + matScore;
		
		// double을 안붙이고 int형으로 연산하면 자료가 손실됨 ex)87.0, double로 강제 형변환 해야함
		avgScore = (double)totalScore / 2; 
		
		
		// 출력
		System.out.println("총점: " + totalScore);  //숫자형이 문자형으로 자동 형변환
		System.out.println("평균: " + avgScore); 
		
		// ++연산자 - 1증가, --연산자 - 1감소
		// ++가 뒤에사용 되는걸 "후치연산" / 앞에 사용하면 "전치연산"
		int num = 10;
		int val = 0;
		
		//val = num++;    // 1. num을 val에 저장 / 2. num=num+1 1증가
		val = ++num;      // 1. num=num+1 1증가 / 2. num을 val에 저장
		
		System.out.println(val);
		System.out.println(num);
			
		
	}

}
