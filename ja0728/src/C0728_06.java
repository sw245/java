import java.util.Arrays;

public class C0728_06 {

	public static void main(String[] args) {

		Card c = new Card();
		Card c2 = new Card();
		Card c3 = new Card();
		
		// 인스턴스 변수
		c.kind = "heart";
		c.number = 4;
		
		c2.kind = "clover";
		c2.number = 7;
		
		c3.kind = "diamond";
		c3.number = 3;
		
		
		Card[] card = new Card[52];
		String[] shape = {"heart","clover","diamond","spade"};
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				card[13*i + j] = new Card();
				card[13*i + j].number = j + 1;
				card[13*i + j].kind = shape[i];
				
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				
				System.out.printf("%s, %d\t",
						card[13*i + j].kind,card[13*i + j].number);
			}
			System.out.println("\n");
		}
		
		
		
		// 클래스 변수
		Card.width = 100;
		Card.height = 250;
		
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		
	}

}
