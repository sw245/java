
public class C0728_12 {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		
		System.out.println(d.x);
		
		change(d.x);
		System.out.println("change 호출 후 : "+d.x);
		
		
		C0728_12.change2(d);
		System.out.println("참조형 변수로 호출 후 : "+d.x);
		
		
		sta = "같은 클래스에서 클래스 선택자(?) 없이 사용 가능?";
		sta += " ㅇㅇ";
		
		/*
		Cal c = new Cal();
		
		
		c.add(a, b);
		// 객체선언 - 같은 클래스 내의 메서드도 객체선언 해야 함
		C0728_12 c2 = new C0728_12();
		int a = 10;
		int b = 5;
		c2.add2(a, b);
		 */
		
		
	}
	
	
	static void change(int x) {
		x = 1000;
		System.out.println("메서드 안에서 출력 : "+x);
		// 리턴이 없으면 값이 변하지 않음 (x는 지역변수이므로)
	}
	
	static void change2(Data d) {
		d.x = 1000;
		System.out.println("메서드 안에서 출력 : "+d.x);
		// 참조변수(주소값)로 넘겨받아서 값을 변경하면 원래 데이터를 변경하게 됨
		// d.x가 함수 밖에 생성되어 있으니 전역 변수 느낌???
	}
	
	
	void add2(int a, int b) {
		System.out.println(a+b);
	}
	
	static String sta = "클래스 변수";
	
}

class Data{
	
	int x;	// 인스턴스 변수 - 객체 개별 사용
	
}