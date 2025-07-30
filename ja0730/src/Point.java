
public class Point extends Object {

	int x;	// 인스턴스 변수 - 객체선언 후, 개별, 참조변수명.변수명
	int y;
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
	
	
	void add() {
		System.out.println(x+y);
		
		
	}
}
