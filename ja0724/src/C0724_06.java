import java.util.Scanner;

public class C0724_06 {

	public static void main(String[] args) {
		
		
		/*
		int[] num = new int[5];
		for(int i=0;i<num.length; i++) {
			num[i] = i;
		}
		
		int[][] score = new int[5][3];
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = 3*i + j;
				
			}
		}
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+" ");
			}
		}
		*/
		
		/*
		System.out.println();
		
		// 5*5 배열 생성, 출력
		
		int[][] fbf = new int[5][5];
		
		for(int i=0; i<fbf.length; i++) {
			for(int j=0; j<fbf[i].length; j++) {
				fbf[i][j] = i*5 + j + 1;
			}
		}
		
		
		for(int i=0; i<fbf.length; i++) {
			for(int j=0; j<fbf[i].length; j++) {
				System.out.printf("%2d ",fbf[i][j]);
			}
			System.out.println();
		}
		*/
		
		
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[][] score = new int[3][3];
		String[] title = {"국어","영어","수학"};
		int[] total = new int[3];
		double[] avg = new double[3];
		
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d번째 이름을 입력하세요.\n",i+1);
			name[i] = scan.next();
			
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%s의 %s점수를 입력하세요.\n",name[i],title[j]);
				score[i][j] = scan.nextInt();
				total[i] += score[i][j];
			}
			avg[i] = total[i] / 3.0;
		}
		
		
		

		System.out.print("이름\t");
		for(int i=0; i<title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.print("합계\t평균");
		System.out.println();
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(total[i]+"\t");
			System.out.printf("%.2f\t",avg[i]);
			System.out.println();
		}
		
		
		
	}

}
