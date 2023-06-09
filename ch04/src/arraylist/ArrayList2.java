package arraylist;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		//정수를 저장할 리스트 생성
		//Integer 클래스: 기본 자료형이 int를 객체화한 클래스
		ArrayList<Integer> numberList = new ArrayList<>();
		
		//요소 저장
		numberList.add(1); numberList.add(2); numberList.add(3);
		numberList.add(4); numberList.add(5); numberList.add(6);
		
		//요소의 합계
		int sumV = 0;
		double avg;
		
		for(int i=0; i<numberList.size(); i++) {
			sumV += numberList.get(i);
		}
		avg = (double)sumV / numberList.size();
		
		System.out.printf("합계: %d\n", sumV);
		System.out.printf("평균: %.2f\n", avg);
		
	}

}
