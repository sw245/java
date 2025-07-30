package ja0730_2;

public class Buyer {
	
	String id;
	String pw;
	String buyerName;
	String address;
	String tel;
	
	int money = 1000_0000;	// 현재 보유 금액
	int bonusPoint = 0;	// 보너스 포인트
	
	void Buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
	}
	
	
	/*
	void Buy(TV t) {
		money -= t.price;
		bonusPoint += t.bonusPoint;
	}
	
	void Buy(Audio a) {
		money -= a.price;
		bonusPoint += a.bonusPoint;
	}
	
	void Buy(Computer c) {
		money -= c.price;
		bonusPoint += c.bonusPoint;
	}
	*/
	
	
}
