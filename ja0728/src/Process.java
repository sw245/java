import java.util.Scanner;

public class Process {
	
	
	// 자바 메소드 단점: return 1개만 가능
	static void resultProcess(int a, int b, double[] result) {
		result[0] = a + b;
		result[1] = a - b;
		result[2] = a * b;
		result[3] = a / b;
	}
	
	
	static void lottoProcess(int[] mynum, int[] lotnum, int[] lotto, int count, int[] numbers) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i + 1;
		}
		for(int i=numbers.length - 1; i>0; i--) {
			int r = (int)(Math.random()*45);
			int temp = numbers[i];
			numbers[i] = numbers[r];
			numbers[r] = temp;
		}
		
		System.arraycopy(numbers, 0, lotnum, 0, 6);
		
		for(int i=0; i<lotnum.length; i++) {
			System.out.printf("1부터 45까지의 로또번호를 입력하세요. (%d/%d)\n",i+1,lotnum.length);
			mynum[i] = scan.nextInt();
			for(int j=0; j<lotnum.length; j++) {
				if(mynum[i] == lotnum[j]) {
					lotto[count] = lotnum[j];
					count++;
					break;
				}
			}
		}
		
		
	}
	
	
	
	static void gugudan(int first, int last) {
		System.out.println("\t\t[   구구단   ]\n");
		
		for(int i=first; i<=last; i++) {
			System.out.printf("[  %d 단  ]\t",i);
		}
		System.out.println();
		for(int j=1; j<=9; j++) {
			for(int i=first; i<=last; i++) {
				System.out.printf("%d X %d = %d\t",i,j,i*j);
			}
			System.out.println();
		}
	}
	
	static void numProcess() {
		// 1~100, 10번 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("[ 숫자 맞히기 ]");
		int r = (int)(Math.random()*100) + 1;
		int[] mynum = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.printf("1부터 100까지의 숫자 중 하나를 입력하세요. (%d/%d)\n",i+1,10);
			int input = scan.nextInt();
			mynum[i] = input;
			if(input > r) {
				System.out.println("입력값이 큽니다.");
			}else if(input < r) {
				System.out.println("입력값이 작습니다.");
			}else if(input == r) {
				System.out.println("정답입니다.");
				System.out.print("내가 입력한 숫자 : ");
				for(int j=0; j<i+1; j++) {
					System.out.printf("%d ",mynum[j]);
				}
				System.out.println();
				break;
			}
			
		}
	}
	
}
