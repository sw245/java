
public class Cal {

	
	// 인스턴스 변수 - 객체 선언 후 사용, 객체 개별사용, 참조변수명.변수명
	int result;
	
	
	// 사칙연산
	
	// return
	int add(int a, int b) {
		result = a + b;
		return result;
	}
	
		
	int subtract(int a, int b) {
		result = a - b;
		return result;	
	}
	
	
	int multiply(int a, int b) {
		result = a * b;
		return result;
	}
	
	
	double divide(int a, int b) {
		double resultD = a / (double)b;
		return resultD;
	}
	
	
	
	
	
	// void
	
	void add2(int a, int b) {
		result = a + b;
		System.out.println("결과 : "+result);
	}
	
	
	void subtract2(int a, int b) {
		result = a - b;
		System.out.println("결과 : "+result);
	}
	
	
	void multiply2(int a, int b) {
		result = a * b;
		System.out.println("결과 : "+result);
	}
	
	
	void divide2(int a, int b) {
		double resultD = a / (double)b;
		System.out.println("결과 : "+resultD);
	}
	
	
	
	
	// array 활용
	void calProcess(double[] num, int a, int b) {
		num[0] = a + b;
		num[1] = a - b;
		num[2] = a * b;
		num[3] = a / (double)b;
	}
	
	
	
	
	
}
