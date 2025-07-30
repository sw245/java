package ja0730_2;

public class Deck {
	
	Card[] deck = new Card[52];
	String[] shape = {
			"SPADE","HEART","DIAMOND","CLOVER"
	};
	
	
	Deck(){
		for(int i=0; i<deck.length; i++) {
			deck[i] = new Card((i%13)+1, shape[i/13]);
		}
	}
	
	
	// 기존 덱 카드 재생성 메서드
	void refillDeck(Card[] deck) {
		for(int i=0; i<deck.length; i++) {
			deck[i] = new Card((i%13)+1, shape[i/13]);
		}
	}
	
	
	
	// 카드섞기 메소드
	void shuffle(Card[] deck) {
		Card temp;
		for(int i=deck.length-1; i>0; i--) {
			int r = (int)(Math.random()*52);
			temp = deck[i];
			deck[i] = deck[r];
			deck[r] = temp;
		}
	}
	
	
	// 카드 5장 뽑기 메서드
	
	Card[] handover() {
		Card[] hands = new Card[5];
		int count = 0;
		int picked = 0;
		do {
			if(deck[count] == null) {
				count++;
			}else {
				hands[count] = deck[count];
				deck[count] = null;
				picked++;
			}
			
		} while(picked < 5);
		
		return hands;
	}
	
	
	// 원하는 순서의 카드 1장 뽑기 메서드
	Card pick(int n) {
		int ncount = 0;
		Card mypick = new Card();
		do {
			for(int i=0; i<deck.length; i++) {
				if(deck[i] != null) {
					ncount++;
				}
				if(ncount == n) {
					 mypick.setNumber(deck[i].getNumber());
					 mypick.setKind(deck[i].getKind());
					 deck[i] = null;
				}
			} // for
			
			if(ncount == 0) {
				refillDeck(deck);
				shuffle(deck);
			}
			
		} while(ncount < n);
			
		return mypick;
	}
	
	// 랜덤 1장 뽑기 메서드
	
	Card pickr() {
		int r = (int)(Math.random()*52);
		int nullc = 0;
		if(deck[r] == null) {
			do {
				r++;
				nullc++;
				if(r==52) r = 0;
				
				if(nullc==52) {
					refillDeck(deck);
				}
			} while(deck[r] == null);
			
		}
		
		return deck[r];
	}
	
}
