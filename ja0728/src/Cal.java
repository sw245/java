
public class Cal {
	
	
	int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	int subtract(int a, int b) {
		int result;
		if(a > b) {
			result = a - b;
		}else {
			result = b - a;
		}
		
		return result;
	}
	
	int multiply(int a, int b) {
		int result = a * b;
		return result;
	}
	
	
	int divide(int a, int b) {
		int result = a * b;
		return result;
	}
	
	void roundProcess(double number, int digit, double[] numbers) {
		
		double shift = Math.pow(10, digit-1);
		
		// 반올림
		numbers[0] = Math.round(number*shift) / shift;
		 
		// 올림
		numbers[1] = Math.ceil(number*shift) / shift;
		
		// 버림
		numbers[2] = Math.floor(number*shift) / shift;
	}
	
	
}
