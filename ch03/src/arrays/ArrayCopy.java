package arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열의 복사
		// 1. 기존 배열의 자료형,배열 크기가 같은것을 새로 만들때
		// 2. 배열의 모든 요소에 자료가 꽉 차서 더큰 배열을 만들때
		
		//int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr1 = new int[] {10, 20, 30, 40, 50};
		int[] arr2 = new int[5];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];   //복사
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		//clone() 메서드 사용하여 복사
		int[] arr3 = new int[5];
		arr3 = arr1.clone();
		
		for(int i:arr3) 
			System.out.print(i + " ");
		
		
		System.out.println();
		
		// System 클래스의 arraycopy()메서드 사용하여 복사
		int[] arr4 = new int[5];
		System.arraycopy(arr1, 0, arr4, 0, 5);
		
		for(int i:arr4) 
			System.out.print(i + " ");
		
	}

}
