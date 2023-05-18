package methods;

public class Math1 {

	public static void main(String[] args) {
		//Math 클래스
		//절대값 구하는 함수 사용 - abs()
		
		int v1 = Math.abs(-7);
		System.out.println("v1: " + v1);
		
		long v2 = Math.round(5.7); //.round(): 반올림
		System.out.println("v2: " + v2);
		
		double v3 = Math.floor(2.11); //.floor(): 소수점을 버림/소수점으로 출력
		System.out.println("v3: " + v3);
		
		//랜덤 - 무작위수(0<=1: 0보다는 크거나 같고 1보다는 작다)
		double rand = Math.random(); //0<=1수중에 랜덤
		System.out.println("rand: " + rand);
		
		//가위바위보(1, 2, 3)
		int 가위바위보 = (int)(Math.random()*3+1);
		System.out.println(가위바위보);
	}

}
