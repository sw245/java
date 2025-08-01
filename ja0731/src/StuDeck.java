import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {

	
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private int kor, eng, math;
	
	private String[] title = {
			"번호","이름","국어","영어","수학","합계","평균","등수"
	};
	
	// 상단 메뉴
	int menu_print() {
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
		int choice = sc.nextInt();
		return choice;
	}// menu_print
	
	
	void stu_input(ArrayList list) {
		System.out.printf("%d번째 학생이름을 입력하세요.\n",list.size()+1);
		name = sc.next();
		System.out.println("국어점수를 입력하세요.");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		math = sc.nextInt();
		// 컬렉션에 저장
		list.add(new Stuscore(name,kor,eng,math));
		
		System.out.println("성적이 입력되었습니다.");
		Stuscore s = (Stuscore)list.get(Stuscore.count - 1);
		/*
		System.out.println("[ 입력된 정보 ]");
		System.out.printf("%d, %s, %d\n",s.getNo(),s.getName(),s.getKor());
		*/
	} // stu_input
	
	
	void stu_output(ArrayList list) {
		System.out.println("[ 학생성적 출력 ]");
		for(int i=0; i<title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------------");
		for(int i=0; i<list.size(); i++) {
			Stuscore s = (Stuscore)list.get(i);
			System.out.printf(
					"%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank()
					);
			System.out.println();
		}
	}
	
}
