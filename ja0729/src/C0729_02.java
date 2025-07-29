import java.util.Scanner;

public class C0729_02 {

	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		long result = factorial(5);
		System.out.println("결과 : "+result);
		
		System.out.println("!n 에 들어갈 n을 입력하세요.");
		int nFactorial =  scan.nextInt();
		long num = 1;
		for(int i=1; i<=nFactorial; i++ ) {
			num *= i;
		}
		System.out.println(num);
		
	}

	public static long factorial(int n) {
		long result;
		if(n==1) {
			result = 1;
		}else {
			result = n * factorial(n-1);
		}
		return result;
	}
	
}
