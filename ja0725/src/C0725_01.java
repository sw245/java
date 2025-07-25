
public class C0725_01 {

	public static void main(String[] args) {
		
		// 기본형 타입 - 8개
		// boolean, byte, char, short, int, float, long, double
		
		boolean a = true;
		boolean a_2 = false;
		
		
		if(a) {
			System.out.println("It's true");
		}else {
			System.out.println("It is false");
		}
		
		
//		char b = ''; 	// 에러
		char b_2 = ' '; // 가능
		char b_3 = 'a';	
//		char b_4 = 'ab';	// 에러
		char b_5 = 97;
		char b_6 = 42;
		
		
		char[] stars = new char[10];
		for(int i=0; i<10; i++) {
			stars[i] = 42;
		}
		
		for(char s : stars) {
			System.out.print(s);
		}
		
		System.out.println();
		
		System.out.println(b_3);
		System.out.println(b_5);
		System.out.println(b_6);
		
		
		// byte, short, char - 사칙연산 시 >> int타입으로 변경됨
		
		int d = 2_147_483_647;
		int d_2 = (int)(2147483648L);
		int d_3 = 100_____________________0000;
	
		
		long e = 1L;
		// long 최대 약 900경 정도까진
		
		float f = 1.0f;
		float f2 = 1.123456789f;
		
		double g = 1.1d;
		double g2 = 1.2;
		
		double g3 = 1.123464564634534324179;
		
		float g4 = 0.1f;
		
		double g_6 = 0.1f;
		
		// float > double 타입변경 시 소수점 7자리 밑으로 불규칙한 값
		
		System.out.println(d_2);
		System.out.println(d_3*d_3/d_3);
		System.out.println(d_3/d_3*d_3);
		
		System.out.println(f2);
		System.out.println(g3);
		System.out.println(g_6);
		
		String s = " ";
		String s2 = new String(" ");
		String s3 = "";
		String s4 = "abc";
		
		int s5 = 10;
		
//		String s6 = (String)s5;	// 에러
		String s6 = "" + s5;
		// 문자열 + 7가지 기본형 연산 >> 문자열
		
		String s7 = "100";
				
		System.out.println(s6 + s7);
		// 문자열 + 문자열 >> 나란히 붙는 방식
		
		
		
		int s9 = Integer.parseInt(s7);	// 문자열 >> int타입 변경
		double s10 = Double.parseDouble(s7);	// 문자열 >> double타입 변경
		System.out.println(s9*5);
		System.out.println(s10*3);
		
		char s11 = s4.charAt(2);	// 문자열 >> char타입 변경
		System.out.println(s11);
		
		String s12 = " ";
		
		// 문자열 비교
		if(s == s2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		if(s == s12) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		if(s.equals(s2)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		
		
		
	}

}
