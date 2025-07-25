
public class TV {

	// 변수
	String color;
	boolean power;
	int channel;

	// 함수 - 메서드
	void power() {
		power = !power;
	}
	
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
}
