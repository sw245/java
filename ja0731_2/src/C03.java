
public class C03 {

	public static void main(String[] args) {
		
		
			System.out.println(1);
			System.out.println(2);
			try {						// 프린트, DB, 인터넷 등.... 만 try catch문 사용
				System.out.println(3);
//				System.out.println(3/0);
				System.out.println(4);
				throw new Exception("고의로 에러 발생"); 
			} catch (Exception e) {
				e.printStackTrace();	// 에러설명 출력
				System.out.println(5);
				System.out.println(6);
			}
			System.out.println(7);
			System.out.println(8);
			System.out.println(9);
				
		
			
			
		
		
		
		/*
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(3/0);	// 나누기 0 >> 에러
			System.out.println(4);
		} catch (Exception e) {
			System.out.println(5);
			System.out.println(6);
		}
		System.out.println(7);
		System.out.println(8);
		*/
	}

}
