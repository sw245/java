package ja0730_2;

public class C01 {

	public static void main(String[] args) {
		
		// 배열 5개 선언
		
		// 1:1:1, 2:2:2, ... , 5:5:5
		
		
		Time[] times = new Time[5];
		
		for(int i=0; i<times.length; i++) {
			times[i] = new Time(i+1,i+1,i+1);
			System.out.println(times[i]);
		}
		
		// t[1] = 12:59:30
		
		times[1].setHour(12);
		times[1].setMinute(59);
		times[1].setSecond(30);
		
		System.out.println(times[1]);
		
		/*
		Time t1 = new Time(10,10,10);
		Time t2 = new Time();
		t2.setHour(11);
		t2.setMinute(11);
		t2.setSecond(11);
		
		System.out.println(t1);
		*/
		
		
	}

}
