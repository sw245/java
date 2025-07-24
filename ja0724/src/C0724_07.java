import java.util.Scanner;

public class C0724_07 {

	public static void main(String[] args) {

		// 이름,국어,영어,수학 점수를 입력받아 출력하시오.
		
		// 1. 변수, 배열 선언 - title[3], name[3], score[3][4], avg[3]
		// 2. 입력
		// 3. 출력
		
		
		// 1.
		String[] title = {"국어","영어","수학"};
		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		
		
		// 2.
		try (
		Scanner scan = new Scanner(System.in)) {
			// 이름 입력
			for(int i=0; i<name.length; i++) {
			
				System.out.printf("%d번째 이름을 입력하세요.\n",i+1);
				name[i] = scan.next();
				// 스코어 입력
				for(int j=0; j<score[i].length-1; j++) {
					System.out.printf("%s의 %s점수를 입력하세요.\n",name[i],title[j]);
					score[i][j] = scan.nextInt();
					score[i][score[i].length - 1] += score[i][j];
				}
				// 평균 입력
				avg[i] = score[i][score[i].length - 1] / (double)(score[i].length - 1);
			}
		}
		
		
		
		
		// 3.
		
		// 상단 컬럼 이름
		System.out.print("이름\t");
		for(int i=0; i<title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println("합계\t평균");
		
		// 이름, 점수(합계), 평균
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.printf("%.2f\n",avg[i]);
		}
		
		
	}

}
