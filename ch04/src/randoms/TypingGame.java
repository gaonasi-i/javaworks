package randoms;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		String[] words = {"rever", "mountain", "sky", "earth", "hores",
						  "moon", "tree", "flower", "cow", "pig"};
		
		int n = 1;   //문제 번호
		double start, end;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어타자 게임, 준비되면 엔터");
		sc.nextLine();
		start = System.currentTimeMillis();  //게임시작 시간측정
		while(n < 11) {
			int rand = (int)(Math.random()*words.length);
			System.err.println("문제" + n);
			String question = words[rand];
			System.out.println(question);   //화면에 문제 표시
			
			String answer = sc.nextLine();
			if(answer.equals(question)) {   //대답이 질문과 같으면
				System.out.println("통과!");
				n++;                        //통과하면 문제번호 1증가
			}else {
				System.out.println("오타! 다시 도전!");
			}
		}
		end = System.currentTimeMillis();
		System.out.println("게임 소요 시간은 " + (end-start)/1000 + "초입니다.");
		sc.close();
	}

}
