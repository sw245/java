package ja0730_2;

public class C04{

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.id = "aaa";
		b.pw = "1111";
		b.buyerName = "홍길동";
		
		/*
		 * [쇼핑몰 사이트]
		 * 1. TV
		 * 2. Audio
		 * 3. Computer
		 * 구매를 원하는 제품의 번호를 입력하세요.
		 * 
		 * */
		
		TV t = new TV();
		b.Buy(t);
		
		System.out.println("현재잔액 : "+b.money);
		System.out.println("현재 보너스포인트 : "+b.bonusPoint);
		
		Audio a = new Audio();
		b.Buy(a);
		
		System.out.println("현재잔액 : "+b.money);
		System.out.println("현재 보너스포인트 : "+b.bonusPoint);
		
		b.Buy(new Computer());
		
		System.out.println("현재잔액 : "+b.money);
		System.out.println("현재 보너스포인트 : "+b.bonusPoint);
		
		
		
	}
}
