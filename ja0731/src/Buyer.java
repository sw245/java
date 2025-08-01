import java.util.ArrayList;

public class Buyer {

	String id;
	String pw;
	String name;
	String address;
	int money;		// 보유금액
	int bonusPoint;	// 적립 포인트
	
	int pcount = 0;
//	Product[] purchased = new Product[20];
	ArrayList purchased = new ArrayList();	// 객체 배열 - 컬렉션
//	Vector list = new Vector();				// 객체 배열 - 컬렉션 >> 구버전
	
	Buyer(){}
	Buyer(String id, String pw, String name, int money, int bonusPoint){
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	void Buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		purchased.add(p);
		pcount++;
	}
	
	
}
