package towdimention;

import java.util.Scanner;

public class SeatArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int customer; //입장객 수
		int colNum = 0;   //좌석 열
		int rowNum = 0;   //좌석 줄(행)
		
		System.out.print("입장객 수를 입력하세요: ");
		customer = sc.nextInt();
		
		System.out.print("좌석열 수를 입력하세요: ");
		colNum = sc.nextInt();
		
		System.out.println();
		
		//연산 처리(조건문) - 나누어 떨어지는 경우, 줄수에 1을 더하는 경우
		if(customer % colNum == 0) {
			rowNum = customer / colNum;
		}else {     //나머지 인원이 있는경우 +1줄 추가
			rowNum = (int)customer / colNum + 1;
		}
		for(int i=0; i<rowNum; i++) {
			for(int j=1; j<=colNum; j++) {
				int num = colNum*i+j;
				if(num > customer)  //좌석번호가 고객수보다 클때 빠져나옴
					break;
				System.out.print("좌석" + num + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//자리배치 배열 공간 생성
		int[][] arr = new int[rowNum][colNum];
		
		for(int i=0; i<rowNum; i++) {
			for(int j=0; j<colNum; j++) {
				arr[i][j] = (colNum*i)+(j+1); 
				if(arr[i][j] > customer)
					break;
				System.out.print("좌석" + arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
