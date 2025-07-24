import java.util.Scanner;

public class C0724_10 {

	public static void main(String[] args) {

		// 1. 변수, 배열 선언 -- 번호, 이름, 점수, 합계, 평균, 타이틀, count
		// 2. while, switch
		
		// 3. 입력
		// 4. 입력 취소
		// 5. 출력
		// 6. 종료
		
		
		// 1. 
		String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균"};
		String[] name = new String[5];
		int[][] score = new int[5][3];
		int[] total = new int[5];
		double[] avg = new double[5];
		int count = 0;
		
		
		// 2. 
		
		try(Scanner scan = new Scanner(System.in)) {
			
			loop: while(true) {
				
				System.out.println("[ 학생성적 프로그램 ]");
				System.out.println("--------------------------------");
				System.out.println("1. 학생성적 입력");
				System.out.println("2. 학생성적 출력");
				System.out.println("3. 학생성적 수정");
				System.out.println("0. 프로그램 종료");
				System.out.println("--------------------------------");
				System.out.println("원하는 번호를 입력하세요.");
				
				int choice = scan.nextInt();
				if(choice==0) break loop;	
				
				switch(choice) {
				case 1:
					System.out.println("[ 학생성적 입력 ]");
					System.out.println("등록할 학생의 이름을 입력하세요.");
					name[count] = scan.next();
					if(name[count].toLowerCase().equals("exit")) break;
					for(int i=0; i<score[count].length; i++) {
						System.out.printf("%s의 %s성적을 입력하세요.\n",name[count],title[i+2]);
						score[count][i] = scan.nextInt();
						total[count] += score[count][i];
					}
					avg[count] = (double)(total[count]) / score[count].length;
					count++;
					System.out.println("입력이 완료되었습니다.");
					scan.nextLine();
					break;
				case 2:
					System.out.println("[ 학생성적 출력 ]");
					for(int i=0; i<title.length; i++) {
						System.out.print(title[i]+"\t");
					}
					System.out.println("\n--------------------------------------");
					for(int i=0; i<count; i++) {
						System.out.print((i+1)+"\t");
						System.out.print(name[i]+"\t");
						for(int j=0; j<score[i].length; j++) {
							System.out.print(score[i][j]+"\t");
						}
						System.out.print(total[i]+"\t");
						System.out.print(avg[i]+"\t");
					}
					scan.nextLine();	// 엔터키 어떻게 하더라..
					break;
				case 3:
					
					break;
				}
			}
		
			
			
			
			
			
		}
		
		
		
	}

}
