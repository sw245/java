import java.util.Scanner;

public class C0725_10 {

	public static void main(String[] args) {
		// 학생성적 프로그램
		// 1. 성적입력	2. 성적출력	3. 성적수정
		
		
		Scanner scan = new Scanner(System.in);
		
		// 변수, 객체 선언
		
		int count = 0;
		String[] name = new String[100];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int score[][] = new int[name.length][3];
		int total[] = new int[name.length];
		double avg[] = new double[name.length];
		
		
		while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("----------------------------------");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("0. 종료");
			System.out.println("----------------------------------");
			System.out.println("원하는 번호를 입력하세요.");
			
			// 입력 제한 / 입력 오류 제어문 // 나중에
			String choiceS = scan.next();
			int choice = Integer.parseInt(choiceS);
			if(choice==0) break;
			
			switch(choice) {
			case 1:
				System.out.println("[ 성적 입력 ]");
				System.out.println("학생의 이름을 입력하세요.");
				name[count] = scan.next();
				for(int i=0; i<3; i++) {
					System.out.printf("%s의 %s성적을 입력하세요.\n",name[count],title[i+2]);
					score[count][i] = scan.nextInt();
					total[count] += score[count][i];
				}
				avg[count] = total[count] / 3.0;
				count++;
				
				System.out.println("성적이 입력되었습니다.");
				break;
			case 2:
				System.out.println("[ 성적 출력 ]");
				for(int i=0; i<title.length; i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("-------------------------------------------------------------");
				for(int i=0; i<count; i++) {
					System.out.print((i+1)+"\t");
					System.out.print(name[i]+"\t");
					for(int j=0; j<score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.print(total[i]+"\t");
					System.out.printf("%.2f",avg[i]);
				}
				System.out.println();
//				scan.nextLine();
				
				break;
			case 3:
				System.out.println("[ 성적 수정 ]");
				System.out.println("성적을 수정할 학생의 이름 또는 이름의 일부를 입력하세요.");
				String ch_name = scan.next();
				int s_count = 0;
				int n_index = 0;
				int s_index[] = new int[name.length];
				String[] n_contain = new String[name.length];
				for(int i=0; i<count; i++) {
					if(name[i].contains(ch_name)) {
						n_contain[s_count] = name[i];
						s_index[s_count] = i;
						s_count++;
					}
				}
				
				
				if(n_contain[0]!=null) {
					System.out.printf("%d건의 결과를 찾았습니다.\n",s_count);
					for(int i=0; i<s_count; i++) {
						System.out.printf("%d. %s",s_index[i],n_contain[i]); 
					}
					System.out.println("\n--------------------------------");
					System.out.println("성적을 수정할 학생을 선택하세요.");
					n_index = scan.nextInt();
				}else {
					System.out.printf("%s 학생을 찾지 못했습니다.\n",ch_name);
					break;
				}
					
						//
				while(true) {
					
					System.out.printf("(%s) >> 수정할 과목의 번호를 입력하세요.\n",name[n_index]);
					System.out.println("1. 국어");
					System.out.println("2. 영어");
					System.out.println("3. 수학");
					System.out.println("0. 처음 화면으로");
					System.out.println("------------------------");
					int ch_sub = scan.nextInt();
					if(ch_sub==0) break;
					
					System.out.printf("새로운 %s점수를 입력하세요.\n",title[ch_sub+1]);
					score[n_index][ch_sub-1] = scan.nextInt();
					total[n_index] = score[n_index][0] + score[n_index][1] + score[n_index][2];
					avg[n_index] = total[n_index] / 3.0;
					System.out.println("성적이 수정되었습니다.");
				}
				break;
				
			
			default:
				System.out.println("잘못된 입력입니다.");
			}
			
		}
		
		
		
	}

}
