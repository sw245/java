
public class C0730_06 {

	public static void main(String[] args) {

		Time t1 = new Time();
//		t1.hour = 10;	// 직접 접근 불가
		
		t1.setHour(10);
		t1.setHour(100);
		
		System.out.println("시간 : "+ t1.getHour());
		
	}

}
