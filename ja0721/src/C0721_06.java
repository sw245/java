
public class C0721_06 {

	public static void main(String[] args) {
		
		// overflow;
		
		byte b = 127;
		System.out.print(b);
		System.out.print('\n');
		b = (byte) (b + (byte)10);	// 127 + 10 = 137
		System.out.println("b : "+b);	// > 오버플로우 발생 (127 다음 -128)
		
		int a = 2147483647;
		a = a + 3;
		System.out.println("a : "+a);
		

	}

}
