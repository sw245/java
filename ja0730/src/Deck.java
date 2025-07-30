
public class Deck {

	final int CARD_NUM = 52;
	
	Card[] c = new Card[CARD_NUM];
	String[] shape = {"SPADE","CLOVER","DIAMOND","HEART"};
	String c_shape[] = {
			"","A","2","3","4","5","6","7","8","9","10","J","Q","K"
	};
	
	
	Deck() {
		for(int i=0; i<c.length; i++) {
			c[i] = new Card(i%13+1,shape[i/13]);
		}
	}	// 생성자
	
	/*
	for(int i=0; i<4; i++) {
		for(int j=0; j<13; j++) {
			c[i*13 + j] = new Card(j+1,shape[i]);
		}
	}
	*/
	
	
	// 전체카드 출력
	void deck_print() {
		for(int i=0; i<c.length; i++) {
			System.out.printf("[%s,%s]\n",c_shape[c[i].number],c[i].kind);
		}
	}
	
	
	//카드 섞기
	void shuffle() {
		Card temp = null;
		for(int i=c.length-1; i>0; i--) {
			int r = (int)(Math.random()*52);
			temp = c[i];
			c[i] = c[r];
			c[r] = temp;
			
		}
	}
	
	//카드 한 장 뽑기
	Card pick(int index) {
		if(index>51 || index<0) {
			return c[0];
		}
		return c[index];
	}
	
	Card pick() {
		int index = (int)(Math.random()*52);
		return c[index];
	}
	
	
}
