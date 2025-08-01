
public class C0731_04 {

	public static void main(String[] args) {
		
		Tank t = new Tank();
		
		t.damage();
		
		System.out.println("탱크 : "+t.healthPoint);
		
		
		SCV s1 = new SCV();	// 기계만 수리가능
		s1.repair(t);
		
		System.out.println("탱크 : "+t.healthPoint);
		
		Marine m1 = new Marine();
		m1.damage();
		
		m1.damage();
		m1.damage();
		System.out.println("마린 : "+m1.healthPoint);
//		s1.repair(m1);	// SCV에게 군인 치료 요청 >> 에러: Repairable만 가능
		System.out.println("마린 : "+m1.healthPoint);
		
	}

}
