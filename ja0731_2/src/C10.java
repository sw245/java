import java.util.ArrayList;
import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int t = 0;
		ArrayList Stulist = new ArrayList(); 
		
		do {
			do {
				try {
					System.out.println("[ 학생성적 프로그램 ]");
					System.out.println("1. 성적 입력");
					System.out.println("2. 성적 출력");
					System.out.println("3. 성적 수정");
					System.out.println("4. 성적 삭제");
					System.out.println("5. 등수처리");
					System.out.println("6. 학생목록 정렬");
					System.out.println("0. 종료");
					System.out.println("-------------------------------");
					System.out.println("원하는 번호를 입력하세요.");
					choice = sc.nextInt();
					t = 0;
				} catch (Exception e) {
					System.out.println("잘못된 입력입니다.");
					t = 1;
					sc.nextLine();
				}
			} while (t == 1);
			
			
			switch(choice) {
			case 1:
				System.out.println("[ 성적 입력 ]");
				Stuscore stu = new Stuscore();
				System.out.println("학생의 이름을 입력하세요.");
				String name = sc.next();
				stu.setName(name);
				System.out.println(name+" 학생의 국어성적을 입력하세요.");
				stu.setKor(sc.nextInt());
				System.out.println(name+" 학생의 영어성적을 입력하세요.");
				stu.setEng(sc.nextInt());
				System.out.println(name+" 학생의 수학성적을 입력하세요.");
				stu.setMath(sc.nextInt());
				stu.setTotal();
				stu.setAvg();
				stu.setNo();
				Stulist.add(stu);
				
				System.out.println("성적 입력이 완료되었습니다.");
				break;
				
				
			case 2:
				System.out.println("[ 성적 출력 ]");
				for(int i=0; i<Stuscore.title.length; i++) {
					System.out.print(Stuscore.title[i]+"\t");
				}
				System.out.println();
				System.out.println("------------------------------------------------------------");
				for(int i=0; i<Stulist.size(); i++) {
					Stuscore temp = (Stuscore)Stulist.get(i);
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
							temp.getNo(),temp.getName(),temp.getKor(),temp.getEng(),temp.getMath(),
							temp.getTotal(),temp.getAvg(),temp.getRank());
				}
				
				
			}// switch
			
			
			
		} while (choice != 0);	// 0 입력 시 종료
		
		
		
		
		
	}

}
