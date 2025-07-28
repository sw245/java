
public class C0728_07 {

	public static void main(String[] args) {

	
		
		Card c1 = new Card();
		c1.kind = "HEART";
		c1.number = 7;
		c1.width = 100;		// '참조변수.클래스변수명'으로도 사용 가능하긴 함 > 근데 비추천
		c1.height = 250;
		
		Card c2 = new Card();
		c2.kind = "SPADE";
		c2.number = 4;
		c1.width = 50;
		c1.height = 80;
		
		
		System.out.printf("%s,%d,%d,%d \n",
				c1.kind,c1.number,c1.width,c1.height);
		
		System.out.printf("%s,%d,%d,%d \n",
				c2.kind,c2.number,c2.width,c2.height);
		
		
	}

}
