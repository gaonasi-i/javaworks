package forexample;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// 입장객 수에 따른 좌석줄(열과줄) 계산 프로그램
		Scanner sc = new Scanner(System.in);
		int customer; //입장객 수
		int colNum;   //좌석 열
		int rowNum;   //좌석 줄(행)
		
		System.out.print("입장객 수를 입력하세요: ");
		customer = sc.nextInt();
		
		System.out.print("좌석열 수를 입력하세요: ");
		colNum = sc.nextInt();
		
		//연산 처리(조건문) - 나누어 떨어지는 경우, 줄수에 1을 더하는 경우
		if(customer % colNum == 0) {
			rowNum = customer / colNum;
		}else {     //나머지 인원이 있는경우 +1줄 추가
			rowNum = (int)customer / colNum + 1;
		}
		System.out.println("--------------------");
		System.out.println("입장객: " + customer + "명");
		System.out.println(rowNum + "개의 줄이 필요합니다.");
		
		sc.close();

	}

}
