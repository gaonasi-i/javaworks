package ifexample;

public class Switchcase1 {
// 파일 이름은 public이 붙어야 한다
	public static void main(String[] args) { 
		// switch ~ case문 : 조건의 값이 정해져있을때 주로 사용
		// 순위에 따른 매달 색상 출력
		int rank = 3;
		//char medalColor;
		String medalColor = "Silver";
		
		switch(rank) {  //switch(조건:변수)
		case 1:
			medalColor = "Gold";
			break;      //break가없으면 아래 구문이 출력됨
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronz";
			break;
		default:  // 1~3등을 제외한 메달은 없다고 출력
			medalColor = "None";
			break;
		}
		System.out.println("메달 색깔은 " + medalColor + "입니다.");
	}

}
