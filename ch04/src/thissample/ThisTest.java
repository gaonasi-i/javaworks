package thissample;

public class ThisTest {
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		
		bDay.setYear(2023);
		System.out.println(bDay);  //bDay의 주소 출력
		bDay.printThis();
	}
}
