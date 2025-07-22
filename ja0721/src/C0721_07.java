
public class C0721_07 {

	public static void main(String[] args) {
		
		// casting : 형 변환
		
		int a = 7000000;
		int result = a * a / a;
		System.out.println("result : "+result);
		
		int result2 = a / a * a;
		System.out.println("result2 : "+result2);
		
		
		int n = 65;
		System.out.println("n :" + 65);
		char ch = (char) n;
		System.out.println("ch :"+ch);
		
		float f = 1.6F;
		System.out.println("f : "+f);
		int num = (int) f;		// 강제 형 변환
		System.out.println("num : "+num);	// 1 출력 (소수점 버림)
		float f2 = num;			// 자동 형 변환 (타입을 붙여주지 않아도 됨)
		System.out.println("f2 : "+f2);		// 1.0
		
	}

}
