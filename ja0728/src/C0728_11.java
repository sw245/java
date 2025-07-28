import java.util.Arrays;
import java.util.Scanner;

public class C0728_11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("[ 프로그램 ]");
		System.out.println("1. 숫자 맞히기");
		System.out.println("2. 로또번호 맞히기");
		System.out.println("3. 구구단");
		System.out.println("4. 사칙연산");
		System.out.println("------------------------------");
		System.out.println("원하는 번호를 입력하세요.");
		
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			Process.numProcess();
			
			break;
			
		case 2:
			int[] mynum = new int[6];
			int[] lotnum = new int[6];
			int[] lotto = new int[6];
			int count = 0; 	// 맞힌 개수
			int[] numbers = new int[45];
			
			Process.lottoProcess(mynum,lotnum,lotto,count,numbers);
			
			
			
			System.out.println("입력번호 : "+Arrays.toString(mynum));
			System.out.println("로또번호 : "+Arrays.toString(lotnum));
			System.out.print("맞힌 번호 : ");
			for(int i=0; i<count; i++) {
				System.out.printf("%d ", lotto[i]);
			}
			System.out.println();
			
			break;
			
		case 3:
			System.out.println("출력을 원하는 첫째 단을 입력하세요. (2 ~ 9)");
			int first = scan.nextInt();
			System.out.println("끝 단을 입력하세요. (2 ~ 9)");
			int last = scan.nextInt();
			Process.gugudan(first,last);
			break;
			
		case 4:
			// 10, 5 사칙연산 값 출력
			double[] result = new double[4];
			int a = 10;
			int b = 5;
			Process.resultProcess(a, b, result);
			
			System.out.println(Arrays.toString(result));
			break;
			
			
		}
		
	}

}
