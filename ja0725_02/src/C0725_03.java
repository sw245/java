
public class C0725_03 {

	public static void main(String[] args) {
		
		// s1, s2
		// s1 - 홍길동,100,100,99,total,avg
		// s2 - 유관순,90,90,91,total,avg
		
		Stuscore s1 = new Stuscore();
		Stuscore s2 = new Stuscore();
		
		
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 100;
		s1.math = 99;
		s1.total();
		s1.avg();
		
		s2.name = "유관순";
		s2.kor = 90;
		s2.eng = 90;
		s2.math = 91;
		s2.total();
		s2.avg();
		
		
		Stuscore[] ss = new Stuscore[] {s1, s2};
		
		
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("---------------------------------------------------------");
		
		for(Stuscore sn : ss) {
			sn.sprint();
		}
		
		
		
		
	}

}
