
public class Shape {

	String color = "blue";
	
	
	void draw(String sname, Point p) {
		System.out.println(sname + " 도형의 그림을 그립니다.");
		System.out.println("중심의 좌표 : "+p.x+", "+p.y);
		// 그림을 그리는 로직
		// ...
	}
	
	void draw(String sname, Point[] p) {
		System.out.println(sname + " 도형의 그림을 그립니다.");
		System.out.printf("꼭짓점의 좌표 : (%d,%d), (%d,%d), (%d,%d)\n",
				p[0].x,p[0].y,p[1].x,p[1].y,p[2].x,p[2].y);
	}
	
}
