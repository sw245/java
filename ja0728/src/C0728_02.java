
public class C0728_02 {

	public static void main(String[] args) {

		// TV클래스 객체생성
		// TV색상 pink
		// 채널 7
		
		TV2 t2 = new TV2();
		
		t2.color = "pink";
		t2.channel = 7;
		
		
		// white, 5
		
		TV2 t22 = new TV2();
		t22.color = "white";
		t22.channel = 5;	
		
		
		System.out.println(t22.color + ", " + t22.channel);
		
		
		t22 = t2;
		System.out.println(t22.channel);
		
		t2.channel = 1;
		System.out.println(t22.channel);
		
		// 참조변수가 사라진 객체는 일정 시간이 지나면 garbage collector가 삭제시킴?
		
		
		
		
	}

}
