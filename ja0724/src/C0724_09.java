import java.util.Scanner;

public class C0724_09 {

	public static void main(String[] args) {

		
		// 학생 수만큼 출력
		// 취소하기
		
		
		
		Scanner scan = new Scanner(System.in);
		
		// 변수, 배열 선언
		int[] no = new int[3]; 
		String[] name = new String[3];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int sCount = 0; // 입력된 학생 수
		int choice;
		
		
		loop: while(true) {
			
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("----------------------------------------");
			System.out.println("1. 학생성적 입력");
			System.out.println("2. 학생성적 출력");
			System.out.println("3. 학생성적 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("----------------------------------------");
			System.out.println("원하는 번호를 입력하세요");
			
			choice = scan.nextInt();
			
			if(choice == 0) break loop;
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생성적 입력 ]");
				for(int i=0; i<name.length; i++) {
					System.out.printf("%d번 학생이름을 입력하세요.\n",sCount+1);
					name[sCount] = scan.next();
					for(int j=0; j<score[i].length; j++) {
						System.out.printf("%s 학생의 %s점수를 입력하세요\n",name[sCount],title[j+2]);
						score[i][j] = scan.nextInt();
						total[i] += score[i][j];
					}
					avg[i] = total[i] / 3.0;
					sCount++;
				}
				break;
								
			case 2:
				System.out.println("[ 학생성적 출력 ]");
				for(int i=0; i<title.length; i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("----------------------------------------------------------");
				for(int i=0; i<name.length; i++) {
					System.out.print((i+1)+"\t");
					System.out.print(name[i]+"\t");
					for(int j=0; j<score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.print(total[i]+"\t");
					System.out.printf("%.2f\n",avg[i]);
				}
				
				break;
				
			case 3:
				System.out.println("[ 학생성적 수정 ]");
				System.out.println("찾을 학생의 이름을 입력하세요.");
				String search = scan.next();
				int temp = 0;
				for(int i=0; i<sCount; i++) {
					if(temp == 1) break;
					if(search.equals(name[i])) {
						System.out.printf("%s 학생을 찾았습니다.\n",name[i]);
						temp = 1;
						
						while(true) {
							System.out.println("[ 수정할 과목 선택 ]");
							System.out.println("1. 국어");
							System.out.println("2. 영어");
							System.out.println("3. 수학");
							System.out.println("0. 취소");
							System.out.println("-----------------------------");
							System.out.println("원하는 번호를 입력하세요.");
							
							choice = scan.nextInt();
							if(choice==0) break;
							
							System.out.printf("현재 %s점수는 %d점입니다. ",title[choice+1],score[i][choice-1]);
							System.out.println("새로운 점수를 입력해 주세요.");
							score[i][choice-1] = scan.nextInt();
							total[i] = score[i][0] + score[i][1] + score[i][2];
							avg[i] = total[i] / 3.0;
							System.out.println("수정이 완료되었습니다.");
							
						} // 성적수정 반복
							
						

						
					} // if(search...)
				} // for
				
				if(temp==0) {
					System.out.println("찾고자 하는 학생이 없습니다.");
				}
				
				break;
			
			} // switch
			
		} // while
	} // main()

} // class
