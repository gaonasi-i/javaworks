package towdimention;

public class TowDimention2 {
	public static void main(String[] args) {
		// 5행 5행 2차원 배열 생성
		char[][] a = new char[5][5];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				//별문자 저장
				a[i][j] = '*';   
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		//삼각형 모양 만들기
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<i+1; j++) {
				//별문자 저장
				a[i][j] = '*';   
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		//역삼각형 모양 만들기
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a[i].length-1; j++) {
				//별문자 저장
				a[i][j] = '*';   
				System.out.print(a[i][j] + " ");
			}
			System.out.println();			
		}
		/*
		 * i=0 j=0 a[0][0] = *
		 *         a[0][1] = **
		 *         a[0][2] = ***
		 *         a[0][3] = ****
		 *         a[0][4] = ***** (최종)
		 * i=1 j=1 a[1][1] = *
		 *         a[1][2] = **
		 *         a[1][3] = ***
		 *         a[1][4] = ****  (최종)
		 * i=2 j=2 a[2][1] = *
		 *         a[2][2] = **
		 *         a[2][3] = ***   (최종)
		 *         
		 */
		
		//숫자 찍기
		/*
		 *  1 2 3 4 5 
		 *  6 7 8 9 10
		 *  11 12 13 14 15
		 *  16 17 18 19 20
		 */
		int[][] arr = new int[4][5];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (arr[i].length*i)+(j+1);   
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
