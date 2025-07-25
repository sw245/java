
public class C0725_02 {

	public static void main(String[] args) {
		
		// println, print, printf
		
		// println() == print("\n")	?
		
		
		int a = 1;
		int b = 2;
		
		double e = 1.12345678;
		
		System.out.println("a : "+a+", b : "+b);
		System.out.printf("a : %d, b : %d\n",a,b);
		// printf() >> 특정 형태의 문자열에 변수를 포함시킬 수 있음
		// %d - 정수, %f - 실수, %s - 문자열, %c - 문자
		
		System.out.printf("%f",e);
		// %f >> 기본값: %.6f (7자리에서 반올림)
		
		
		int h = 123;
		System.out.printf("\n[%5d]",h);
		System.out.printf("\n[%05d]",h);
		System.out.printf("\n[%-5d]",h);
		
	}

}
