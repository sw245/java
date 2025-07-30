package ja0730_2;

public class C03 {

	public static void main(String[] args) {

		Car car = null;	// 주소값 - 저장공간없음
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		Ambulance amb = new Ambulance();
		Ambulance amb2 = null;
		Car car2 = new Car();
		
		
		fe.water();
		car = fe;	// (Car)fe; 형 변환 생략 ( 자손 >> 조상 )
//		car.water();	// 에러, Car는 FireEngine을 상속받지 않음 > 반대
		fe2 = (FireEngine)car;
		fe2.water();
		
//		fe2 = (FireEngine)car2;
//		fe2.water();	// 에러. car2는 처음 Car 객체로 생성되었기 때문에
		// 자손으로 형변환 해도 해당 객체에 해당 기능이 없기 때문에 사용 불가
		
		car = amb;
		
		if(amb instanceof Ambulance) {
			System.out.println("It's an Ambulance.");
		}
		if(amb instanceof Car) {
			System.out.println("It's a Car.");
		}
		if(amb instanceof Object) {
			System.out.println("It's an Object.");
		}
		
		if(car instanceof Ambulance) {
			System.out.println("It's an Ambulance.");
		}else {
			System.out.println("It's not an Ambulance.");
		}
		
		if(car instanceof FireEngine) {
			System.out.println("It's a FireEngine.");
		}else {
			System.out.println("It's not a FireEngine.");
		}
		
		
		
		
		
//		fe2 = (FireEngine)car;	// 형변환은 가능하지만 사용할 수 없음
	}

}
