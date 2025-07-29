
public class C0729_03 {

	public static void main(String[] args) {

		/*
		long result = MyMath.add(100, 50);	// 클래스 메서드 
		System.out.println(result);
		
		MyMath m = new MyMath();
		
		m.add();	// 인스턴스 메서드 - 객체선언 후 사용
		m.a = 100;	// 인스턴스 변수 - 객체선언 후 사용
		m.b = 50;
		System.out.println(m.add());
		
		add(1,"2");
		
		System.out.println(1);
		System.out.println("2");
		System.out.println('3');
		System.out.println(false);
	
		add(false,"6");
		*/
		
		Card c = new Card();
		// new >> 인스턴스 생성 , Card() >> 생성자 호출
		
		System.out.println(c.number);
		
		
	}

	static void add(int a, String b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}
	static void add(char a, String b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}
	static void add(String a, String b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}
	static void add(boolean a, String b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}
	
}
