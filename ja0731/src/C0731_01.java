import java.util.Scanner;

public class C0731_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		
		Buyer[] buyers = new Buyer[] {
				new Buyer("aaa","1111","홍길동",1000_0000,0),
				new Buyer("asdf","2222","이순신",500_0000,500_000),
				new Buyer("qwer","3333","유관순",7000_0000,0),
				new Buyer("bbb","4444","김구",1_0000_0000,1000_0000)
		};
		
		Buyer user = null;
		
		System.out.println("[ 로그인 ]");
		System.out.println("아이디를 입력하세요.");
		String idIn = sc.next();
		for(Buyer b : buyers) {
			if(b.id == idIn) {
				user = b;
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		}
		
		System.out.println("비밀번호를 입력하세요.");
		String pwIn = sc.next();
		
		System.out.printf("%s님 로그인 되었습니다.\n",user.name);
		System.out.printf("현재 잔액 : %,d\n",user.money);
		
//		Buyer = 
		
		do {
			System.out.println("[ 쇼핑몰 프로그램 ]");
			System.out.println("1. TV - 1,000,000원");
			System.out.println("2. Audio - 500,000원");
			System.out.println("3. Computer - 1,500,000원");
			
			System.out.println("8. 현재 보유 금액");
			System.out.println("9. 구매한 제품 보기");			
			System.out.println("0. 나가기");
			System.out.println("---------------------------------------------");
			System.out.println("원하는 번호를 입력하세요.");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				user.Buy(new TV());
				System.out.println("TV를 구매했습니다.");
				System.out.printf("현재 잔액 : %,d\n",user.money);
				break;
			case 2:
				user.Buy(new Audio());
				System.out.println("오디오를 구매했습니다.");
				System.out.printf("현재 잔액 : %,d\n",user.money);
				break;
				
			case 3:
				user.Buy(new Computer());
				System.out.println("컴퓨터를 구매했습니다.");
				System.out.printf("현재 잔액 : %,d\n",user.money);
				break;
					
			case 8:
				System.out.println("[ 현재 보유 금액 ]");
				System.out.printf("%,d원",user.money);
				break;
				
			case 9:
				System.out.println("[ 구매한 제품 목록 ]");
				for(int i=0; i<user.purchased.size(); i++) {
					System.out.printf("%d. %s\n",i+1,((Product)user.purchased.get(i)).name);
				}
				break;
			}
			
			
			
		} while(choice != 0);
		
		
		
	}

}
