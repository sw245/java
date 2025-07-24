import java.util.Scanner;

public class C0724_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 이름 5개를 입력받아 출력
		
		String[] name = new String[3];
		int[] kor = new int[name.length];
		int[] eng = new int[name.length];
		int[] math = new int[name.length];
		int[] total = new int[name.length];
		double[] avg = new double[name.length];
		
		// 입력
		for(int i=0; i<name.length; i++) {
			System.out.printf("이름을 입력하세요. (%d/%d)\n",i+1,name.length);
			name[i] = scan.next();
			System.out.printf("%s의 국어점수를 입력하세요.\n",name[i]);
			kor[i] = scan.nextInt();
			System.out.printf("%s의 영어점수를 입력하세요.\n",name[i]);
			eng[i] = scan.nextInt();
			System.out.printf("%s의 수학점수를 입력하세요.\n",name[i]);
			math[i] = scan.nextInt();
			total[i] = math[i] + kor[i] + eng[i];
			avg[i] = total[i] / 3.0;
			
		}
		
		
		// 출력
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("---------------------------------------------");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
		}
		
		
		
		
		
		/*
		// 배열 값 할당 1
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		// 2
		int[] arr_1 = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = i + 1;
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		
		
		
		// 3
		int[] arr2 = {1,2,3,4,5};
		
		// 4
		int[] arr3 = new int[] {1,2,3,4,5};
		*/
	
	}
}
