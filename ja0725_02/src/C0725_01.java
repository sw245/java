
public class C0725_01 {

	public static void main(String[] args) {
		
		// 변수사용
		int a = 10;
		String str2 = "abc";
		
		// str - 참조형 변수, 참조변수
		String str = new String("abc");
		

		// 객체 선언, 인스턴스 선언
		TV t = new TV();
//		System.out.println(t);
		
		t.color = "white";
		t.power();
		t.channel = 7;
		t.channelUp();
		
		System.out.println(t.channel);
		
		TV t2 = new TV();
		
		t2.color = "pink";
		t2.channel = 5;
		System.out.println("현재 채널 : "+t2.channel);
		
		
		Stuscore s = new Stuscore();
		
	}

}
