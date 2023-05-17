package forexample;

public class Gugudan {

	public static void main(String[] args) {
		// 중첩 for로 전체 구구단 출력
		int dan;
		int times;
		for(dan=2; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				System.out.println(dan + "x" + times + "=" + (dan * times));
			}
		System.out.println("-------");
		}
		
		System.out.println("★★★★★★★");
		
		for(dan=2; dan<=9; dan++) {
			for(times=1; times<=dan; times++) {
				System.out.println(dan + "x" + times + "=" + (dan * times));
			}
		System.out.println("-------");
		}
		
		// 중첩 for문 (5행 5열)
		for(int i=0; i<4; i++) {
			for(int j=1; j<=5; j++) {
				int num = 5*i+j;   //5는 col의 종료값
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
	}

}
