package ja0730_2;

public class C02 {

	public static void main(String[] args) {
		
		
		// 카드 52장 생성, 카드는 모양 번호 포함
		Deck d = new Deck();
		
		
		/*
		// 카드 섞기
		d.shuffle(d.deck);
		
		// 카드 5장 출력 
		Card[] myhands = d.handover();
		
		for(int i=0; i<myhands.length; i++) {
			System.out.println(myhands[i]);
		}
		*/
		
		
		/*
		// 31번째 카드를 출력
		Card mypick = d.pick(31);
		System.out.println(mypick);
		*/
		
		// 랜덤으로 카드 한 장 출력
		Card rancard = d.pickr();
		System.out.println(rancard);
		
	}

}
