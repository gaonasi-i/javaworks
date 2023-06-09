package game_level;

public class Player {
	
	//필드
	private PlayerLevel level;
	
	//생성자
	public Player() {
		level = new Beginner();
		level.showLevelMessage();   //초보자 입니다.
	}
	
	//showLevelMessage()를 변경하는 메서드 - 매게변수의 다형성
	public void upgeradeLevel(PlayerLevel level) {
		this.level = level; 
		level.showLevelMessage();
	}
	
	//play 메서드
	public void play(int count) {
		level.go(count);
	}
}
