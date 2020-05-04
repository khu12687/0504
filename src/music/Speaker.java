package music;
//음향기기 중 스피커를 정의함
public class Speaker extends MusicMachine implements Roller{
								//is a								is a
	int x=3;
	//LED등 효과를 내는 기능!!
	public void showLED(){
		x=7;
	}
	//볼륨!!
	//추상 클래스를 상속받는 지식은, 재산을 물러받는것이앙나라,빚을 물려받게 되며, 이때
	//추상클래스를 상속받는 자식은 부모고 안성하지 못한 추상메서드를 완전하게 할 의무를 가지게된다.
	//즉 구현강제 당한다!!
	//추상클래스의 자식은 부모의 메서드를 오버라이드 할 의무가 있다
	public void setVolume(){
		
	}
	
	//mp3 플레이 기능
	public void playMP3(){

	}

	public void roll(){
		
	}
}
