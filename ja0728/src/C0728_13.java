import java.util.Scanner;

public class C0728_13 {

	public static void main(String[] args) {
		
		// 소수점을 입력한 후 둘째 자리에서 반올림 
		//(n째 자리에서 반올림되어 나온 숫자 출력)
		
		Scanner scan = new Scanner(System.in);
		
		double numbers[] = new double[3];	// 결과값 컨테이너
		Cal cal = new Cal();
		
		System.out.println("반올림할 숫자를 입력하세요.");
		double number = scan.nextDouble();
		System.out.println("반올림할 자릿수를 입력하세요.");
		int digit = scan.nextInt();
		
		/*
		for(int i=0; i<round-1; i++) {
			shift *= 10;
		}
		*/
		cal.roundProcess(number, digit, numbers);
		
		
		// pow() >> 제곱메서드 Math.pow(10,4) == 10000
		
//		System.out.println(shift);
		
		
		
		System.out.println("반올림된 숫자 : "+numbers[0]);
		System.out.println("올림된 숫자 : "+numbers[1]);
		System.out.println("버림된 숫자 : "+numbers[2]);
		
		
		
	}

}
