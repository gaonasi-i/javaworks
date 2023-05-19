package arrays;

import java.util.Scanner;

public class CalsScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		boolean run = true;
		int[] scores = null;
		
		while(run){
			try {
				System.out.println("--------------------------------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("--------------------------------------------");
				System.out.print("선택> ");
				
				int selectNo = Integer.parseInt(sc.nextLine());
				
				
				if(selectNo == 1) {
					System.out.print("학생수> ");
					int studentNum = Integer.parseInt(sc.nextLine());
					scores = new int[studentNum];
				}else if(selectNo == 2) {
					if(scores != null) {
						for(int i=0; i<scores.length; i++) {
							System.out.println("scores[" + i + "]");
							scores[i] = Integer.parseInt(sc.nextLine());
						}
					}else {
						System.out.println("1번을 먼저 선택해주세요.");
					}
				}else if(selectNo == 3) {
					if(scores != null) {
						for(int i=0; i<scores.length; i++) {
							System.out.println("scores[" + i + "]>" + scores[i]);
						}
					}
				}else if(selectNo == 4) {
					//분석 - 총점, 평균, 최고점수
					if(scores != null) {
						int sumV = 0;    //총점
						double avg;	     //평균
						int maxV = scores[0];  //최대값은 첫번째 값으로 설정
						
						for(int i=0; i<scores.length; i++) {
							sumV += scores[0];      //누적 합계
							if(maxV < scores[i])    //다음 점수가 최대값보다 크다
								maxV = scores[i];   //점수를 최대값으로 설정함
						}
						avg = (double)sumV / scores.length;
						
						System.out.println("총점: " + sumV);
						System.out.println("평균: " + avg);
						System.out.println("최고 점수: " + maxV);
						
						
					}else {
						System.out.println("1번을 먼저 선택해주세요.");
					}
				}else if(selectNo == 5) {
					run = false;
					System.out.println("프로그램을 종료합니다.");
				}else {
					System.out.println("지원되지 않는 메뉴입니다. 다시 선택해 주세요");
				}
			}catch(Exception e){
				System.out.println("올바른 선택이 아닙니다. 다시 선택해 주세요");
			}
		}
	}

}
