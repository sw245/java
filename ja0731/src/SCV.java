
public class SCV extends GroundUnit implements Repairable {
	
	SCV(){
		super(60);
	}
	
	void repair(Repairable r) {	// Repairable에는 아무 것도 없음
		Unit u = (Unit)r;
		while(u.healthPoint != u.MAX_HP) {
			// 지연시간
			u.healthPoint++;
		}
	}	
	
}
