
public class C0729_07 {

	static int b;	// 클래스변수 - 
	int c;	// 인스턴스변수 - 
	public static void main(String[] args) {
		
		int a = 0;	// 초기화 안 됨.
		System.out.println(a);
		
		
		C0729_07 exclass = new C0729_07();
		
		
		System.out.println(b);
		System.out.println(exclass.c);
	}

}
