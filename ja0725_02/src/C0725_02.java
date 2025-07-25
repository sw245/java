
public class C0725_02 {

	public static void main(String[] args) {

		// 객체 선언
		// 홍길동 100 100 99 299 99.67
		
		Stuscore s = new Stuscore();
		
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 100;
		s.math = 99;
		s.total();
		s.avg();
		
		System.out.println(s.avg);
	}

}
