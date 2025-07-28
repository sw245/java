
public class C0728_03 {

	public static void main(String[] args) {

		// Stuscore 객체 - 홍길동 100 100 100
		// 유관순 - 90 90 90
		
		
		Stuscore sH = new Stuscore();
		
		sH.name = "홍길동";
		sH.kor = 100;
		sH.eng = 100;
		sH.eng = 100;
		sH.total = sH.kor + sH.eng + sH.math;
		
		System.out.println(sH.name +", "+ sH.kor +", "+ sH.eng +", "+ sH.math +", "+ sH.total);
		
		
		Stuscore sY = new Stuscore();
		
		sY.name = "유관순";
		sY.kor = 90;
		sY.eng = 90;
		sY.math = 90;
		sY.total = sY.kor + sY.eng + sY.math;
		
		System.out.println(sY.name +", "+ sY.kor +", "+ sY.eng +", "+ sY.math +", "+ sY.total);
		
		sY = sH;
		
		sH.name = "이순신";
		
		System.out.println(sY.name);
		
		
		
	}

}
