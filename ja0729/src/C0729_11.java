
public class C0729_11 {

	public static void main(String[] args) {

		Stuscore[] stus = new Stuscore[10];
		
		
		stus[0] = new Stuscore();
		stus[1] = new Stuscore();
		
		System.out.println(stus[0].no);
		System.out.println(stus[1].no);
		
		stus[2] = new Stuscore("홍길동",100,100,100);
		stus[3] = new Stuscore("강감찬",90,99,100);
		
		System.out.println(stus[2].no);
		System.out.println(stus[3].no);
		
		
		
		
		
	}

}
