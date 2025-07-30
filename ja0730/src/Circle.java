
public class Circle extends Shape {

	
	int r;	//  반지름
	Point center;	// 중심 ( 포인트 객체 - x, y 좌표)
	String sname = "Circle";
	
	Circle(){
		this(new Point(0,0),100);
	}
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
	
	
}
