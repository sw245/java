
public class C0729_05 {

	public static void main(String[] args) {

		Car car = new Car();
		
		car.color = "white";
		car.gearType = "auto";
		car.door = 5;
		
		Car car2 = new Car();
		
		car2.color = "black";
		car2.gearType = "auto";
		car2.door = 5;
		
		Car car3 = new Car("pink","stick",4,100);
		Car car4 = new Car("silver","auto",5,120);
		
		// car3값이 복사된 car5(다른 인스턴스) 생성
		Car car5 = new Car(car3);
		
		
		
	}

}
