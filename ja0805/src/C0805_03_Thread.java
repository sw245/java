
public class C0805_03_Thread {

	public static void main(String[] args) {

		/*
		// 싱글쓰레드 - 우리가 현재 작업하는 모든 것이 싱글쓰레드 방식
		// 앞의 것을 다 실행하고 나서 뒤의 작업을 실행
		for(int i=0; i<300; i++) {
			System.out.println("----");
		}
		
		for(int i=0; i<300; i++) {
			System.out.println("||||");
		}
		*/
		
		
		
		// 멀티쓰레드 방식
		
		MyThread1 m1 = new MyThread1();
		MyThread2 m2 = new MyThread2();
		
		m1.start();
		m2.start();
	}

}
