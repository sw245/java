
public class C0730_03 {

	public static void main(String[] args) {

		Deck d = new Deck();	// 52장 카드 생성
		
		
		d.shuffle();
//		d.deck_print();
		
		
		Card c1 = d.pick(26);
		System.out.printf("[%s,%s]\n",d.c_shape[c1.number],c1.kind);
	
		Card c2 = d.pick();
		System.out.printf("[%s,%s]\n",d.c_shape[c2.number],c2.kind);

		
		System.out.println(c1);
		
	}

	
	
}
