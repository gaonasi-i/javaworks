package arrays;

public class ArrayCalc {

	public static void main(String[] args) {
		// 배열의 총점과 평균
		// 80, 70, 85, 60 입력
		int[] score = new int[4];
		int total = 0;
		double avg;
		
		score[0] = 80;
		score[1] = 70;
		score[2] = 85;
		score[3] = 60;
		
		//총점 계산
		for(int i=0; i<score.length; i++) {
			total += score[i]; //total = score[i] + total; 
		}
		System.out.println("합계: " + total);
		
		//평균
		avg = (double)total / score.length;  //total이 int형이라 double로 형변환 해줘야 소수점이 소실되지 않음
		System.out.println("평균: " + avg);
		
		//최고점수
		int maxV = score[0];  //인덱스 첫번째 값을 최고점수로 임의 설정
		for(int i=1; i<score.length; i++) {
			if(maxV < score[i]) { //최대값이 다음 점수보다 적으면 다음 점수로 최대값을 설정하면서 반복
				maxV = score[i];
		System.out.println("최고점수: " + maxV);
			}
		}
	}

}
