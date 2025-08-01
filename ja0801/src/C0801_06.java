import java.util.ArrayList;

public class C0801_06 {

	public static void main(String[] args) {

		/*
		String n = "n";
		for(int i=0; i<100; i++) {
			n = n + i;	// >> 새로운 인스턴스 생성 (String은 immutable이므로)
		}
		*/
		
		
		
		/*
		String a = "lemonmeloncookie";
		String aa =
				
				"lemonmeloncookielemonmeloncookie";
		
		System.out.println(a.startsWith("lemon"));
		
		System.out.println(a.substring(5,10));
		System.out.println(a.substring(0,a.length()-1));
		
		String[] arr = { "lemon", "melon", "cookie" };
//		String[] arr_sub = new String[3];
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].substring(0,arr[i].length()-1));
		}
		*/
		
		/*
		StringBuffer s = new StringBuffer("lemon");
		
		s.append("melon");
		s.append("cookie");
		
		System.out.println(s);
		*/
		
		
		// Math 클래스
		int a = 40;
		int b = 65;
		int c = 53;
		
		// 세 수의 최댓값 구하기
		int nummax = Math.max(c,Math.max(a, b));
		
		
		System.out.println(nummax);
	
		
		ArrayList list = new ArrayList();	// Object 타입으로 받기 때문에 리스트에 있는 객체를 사용할 때는 원래 클래스로 형 변환 해야 함 
		
		list.add(a);	// 기본형 타입이 객체타입(래퍼 클래스)로 자동 형변환됨
		
		System.out.println(list.get(0));	// wrapper 클래스는 Object >> Integer 자동 형 변환됨
		
		
		
		
		
	}
	

}
