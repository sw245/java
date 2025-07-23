import java.util.Scanner;

public class C0723_10 {

	public static void main(String[] args) {
		
		String[] name = new String[3];
		int[] kor = new int[name.length];
		int[] eng = new int[name.length];
		int[] math = new int[name.length];
		int[] total = new int[name.length];
		double[] avg = new double[name.length];
		
		// 이름 5명을 입력받아, 출력하기
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("이름을 입력하세요. (%d/%d)\n",i+1,name.length);
			name[i] = scan.next();
			System.out.printf("%s 학생의 국어점수를 입력하세요.\n",name[i]);
			kor[i] = scan.nextInt();
			System.out.printf("%s 학생의 영어점수를 입력하세요.\n",name[i]);
			eng[i] = scan.nextInt();
			System.out.printf("%s 학생의 수학점수를 입력하세요.\n",name[i]);
			math[i] = scan.nextInt();
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / 3.0;
		}
		
		System.out.print("입력이름 : ");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s\t",name[i]);
		}
		System.out.println();
		System.out.print("국어점수 : ");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d\t",kor[i]);
		}
		System.out.println();
		System.out.print("영어점수 : ");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d\t",eng[i]);
		}
		System.out.println();
		System.out.print("수학점수 : ");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d\t",math[i]);
		}
		System.out.println();
		System.out.print("합계　　 : ");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d\t",total[i]);
		}
		System.out.println();
		System.out.print("평균　　 : ");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%.1f\t",avg[i]);
		}
		
		
	}

}
