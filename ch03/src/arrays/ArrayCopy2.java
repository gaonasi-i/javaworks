package arrays;

public class ArrayCopy2 {

	public static void main(String[] args) {
		char[] arr1 = {'N', 'E', 'T'};
		char[] arr2 = new char[3];
		char[] arr3 = new char[3];
		
		//배열 복사
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];   //복사
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		//역순 복사
		for(int i=0; i<arr3.length; i++) {
			arr3[2-i] = arr1[i];   //arr1을 거꾸로 돌려서 arr3에 넣음
			System.out.print(arr3[2-i] + " ");
		}
		
		System.out.println();
		
		//역순 복사 출력
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
		for(int i=arr3.length-1; i>=0; i--) {
			arr3[i] = arr1[i];
			System.out.print(arr3[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[arr1.length-1-i];   //arr1을 거꾸로 돌려서 arr3에 넣음
			System.out.print(arr3[i] + " ");
		}
		
	}

}
