
public class Point3D extends Point {
	
	int z;
	
	Point3D(int x, int y, int z){
//		super();	// 조상의 기본생성자를 호출함
		super(x,y);
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return String.format("x : %d, y : %d, z : %d",x,y,z);
	}
	
	
}
