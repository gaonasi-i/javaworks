package objectarray;

public class DogName {

	public static void main(String[] args) {
		// 강아지 3마리 생성
		Dog[] dogArray = new Dog[3];
		
		for(int i=0; i<dogArray.length; i++) {
			//각각의 배열 요소의 객체를 생성
			dogArray[0] = new Dog();
		}
		
		dogArray[0].setDogName("백구");
		dogArray[0].setDogType("진돗개");
		
		System.out.println(dogArray[0].getDogName());
		System.out.println(dogArray[0].getDogType());
	}

}