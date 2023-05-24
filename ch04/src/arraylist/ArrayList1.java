package arraylist;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		//배열: String[] cart = new String[10]
		
		//10개의 저장 공간이 기본적으로 생성됨
		ArrayList<String> cartList = new ArrayList<>();
		
		//자료저장
		cartList.add("계란");
		cartList.add("참기름");
		cartList.add("딸기");
		
		//특정한 한개의 요소를 가져올때: get()
		System.out.println(cartList.get(0));
		System.out.println(cartList.get(1));
		
		//cartList의 크기: size()
		System.out.println(cartList.size() + "개");
		
		for(int i=0; i<cartList.size(); i++) {
			//get()으로 가져와서 변수(cart)에 할당
			String cart = cartList.get(i);      
			System.out.println(cart);
		}
		
		//요소를 수정할때: set()
		cartList.set(1, "라면");
		
		//요소 삭제: remove()
		//객체를 포함하고 있는지 확인: contains()
		if(cartList.contains("딸기"))
			cartList.remove("딸기");
		
		if(cartList.contains(cartList.get(1)))
		 	cartList.remove(1);
		
		//향상 for문으로 출력
		for(String cart : cartList) {
			System.out.printf("[%s]", cart);
		}	
		
	}

}
