
public class Car {
	
	
	Car(){
//		color = "white";
//		gearType = "auto";
//		door = 5;
		this("white","auto",5,120);	// this() > 다른 생성자를 가리킴
	}
	
	Car(String color, String gearType, int door, int door_size){
		this.color = color;		// this. > 인스턴스를 가리킴 
		this.gearType = gearType;
		this.door = door;
		this.door_size = door_size;
	}
	
	// 다른 인스턴스 복사하기
	Car(Car c){
		// 
		this(c.color,c.gearType,c.door,c.door_size);
//		color = c.color;
//		gearType = c.gearType;
//		door = c.door;
//		door_size = c.door_size;
	}
	
	String color;
	String gearType;
	int door;
	int door_size;
	
}
