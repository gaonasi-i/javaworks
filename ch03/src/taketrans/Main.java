package taketrans;

public class Main {

	public static void main(String[] args) {
		// 사람 객체 생성
//		Person inbi = new Person("박인비", 10000);
//		Person nara = new Person("이나라", 5000);
		
		Person gaeun = new Person("이가은", 5000);
		
		//버스 객체 생성
//		Bus bus100 = new Bus(100);
		Subway line = new Subway("1호선");
		
		//사람이 버스를 탄다
//		inbi.takeBus(bus100);
//		nara.takeBus(bus100);
		gaeun.takeline(line);
		
//		inbi.showInfo();
//		nara.showInfo();
		gaeun.showInfo();
		
//		bus100.showInfo();
		line.showInfo();

	}

}
