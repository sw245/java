
public class Unit {
	
	int healthPoint;
	final int MAX_HP;	// 최대체력
	
	Unit(){
		MAX_HP = 0;
	}
	
	Unit(int healthPoint){
		MAX_HP = healthPoint;
		this.healthPoint = healthPoint;
	}
	
	void damage() {
		healthPoint -= 5;
	}
}
