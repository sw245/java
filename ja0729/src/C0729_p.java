
public class C0729_p {

	public static void main(String[] args) {

		String a = "이거 진짜예요?";
		
		String b = new String("진짤루예요가짤루예요");
		
		Practice.method(a);
		Practice.method(b);
		
		Practice p = new Practice();
		
		Practice.method(p);
		
		if(a.equals("이거 진짜예요?")) {
			System.out.println("가짤루예여");
		}else {
			System.out.println(a);
		}
			
		if(b.equals("진짤루예요가짤루예요")) {
			System.out.println("가짤루예여");
		}else {
			System.out.println(b);
		}
		
		if(p.c.equals("그게 정말인가요?")) {
			System.out.println("가짤루예여");
		}else {
			System.out.println(p.c);
		}
		
		System.out.println(p);
		
		
	}

	
	
}
