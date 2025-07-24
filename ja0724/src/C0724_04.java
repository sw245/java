import java.util.Scanner;

public class C0724_04 {

	public static void main(String[] args) {
		// 1~45까지 숫자 6개를 입력받고
		// 로또번호 6개를 생성해서 입력변호와 로또번호 출력
		
		
		// 로또번호 입력
		
		Scanner scan = new Scanner(System.in);
		
		int[] in_num = new int[6];
		System.out.println("로또번호를 입력하세요. [1~45]");
		for(int i=0; i<in_num.length; i++) {
			System.out.printf("(%d/%d)\n",i+1,in_num.length);
			in_num[i] = scan.nextInt();
		}

		
		// 로또번호 생성
		
		int[] lotnum = new int[45];
		for(int i=0; i<lotnum.length; i++) {
			lotnum[i] = i + 1;
		}
		
		int rnum;
		int temp;
		for(int j=0; j<3; j++) {
			for(int i=0; i<lotnum.length; i++) {
				rnum = (int)(Math.random()*45);
				temp = lotnum[i];
				lotnum[i] = lotnum[rnum];
				lotnum[rnum] = temp;
			}			
		}
		
		// 입력번호, 로또번호 출력
		
		System.out.print("입력번호 : ");
		for(int i=0; i<6; i++) {
			System.out.print(in_num[i]+" ");
		}
		System.out.println();
		System.out.print("로또번호 : ");
		for(int i=0; i<6; i++) {
			System.out.print(lotnum[i]+" ");
		}
		
		
	}

}
