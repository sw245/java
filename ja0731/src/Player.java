
abstract public class Player {

	int num;
	int pos;
	
	// 미완성 메서드가 1개라도 있으면
	// 클래스에 abstract을 붙여야 함
	
	abstract void play(int pos);
	abstract void stop(int pos);
	abstract void jump(int pos);
	
}
