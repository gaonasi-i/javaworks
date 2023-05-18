package arrays;

public class ArrayAlphabet {

	public static void main(String[] args) {
		// 1부터 10까지 저장하는 배열
		int[] numbers = new int[10];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i + 1;
			//System.out.print(numbers[i] + " ");
		}
		
		//알파벳 대문자 - 저장(26개)
		char[] alphabets = new char[26];
		char ch = 'A';
		
		alphabets[0] = ch;
		alphabets[1] = (char) (ch + 1);
		
//		System.out.print(alphabets[0]);
//		System.out.print(alphabets[1]);
		
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++; //ch = (char) (ch + 1);  // ch++은 왜 문자열 자료형을 선언하지 않는걸까...? //ch++은 숫자형 자료가 없기때문에 형변환을 해줄 필요가없다
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
	}

}
