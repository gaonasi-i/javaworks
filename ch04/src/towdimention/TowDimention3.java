package towdimention;

public class TowDimention3 {
	public static void main(String[] args) {
		//문자행 2차원 배열
		char[][] alphabets = new char[6][5];
		alphabets[0] = new char[1];
		char ch = 'A';
		
		//알파벳 저장
//		for(int i=0; i<alphabets.length; i++) {
//			for(int j=0; j<alphabets[i].length; j++) {
//				alphabets[i][j] = ch;
//				ch ++;
//			}
//		}
//		
//		//알파벳 출력
//		for(int i=0; i<alphabets.length; i++) {
//			for(int j=0; j<alphabets[i].length; j++) {
//				System.out.print(alphabets[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int i=alphabets.length-1; i>=0; i--) {
			for(int j=alphabets[i].length-1; j>=0; j--) {
				alphabets[i][j] = ch;
				ch ++;
				System.out.print(alphabets[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
