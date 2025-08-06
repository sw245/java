import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {

		// 학생 0.파일 읽어오기 2.출력 3.이름정렬 1.입력 4.등수 5.수정  9.파일에 저장
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		int choice = 100;
		StuDeck stuDeck = new StuDeck();
		
		
		
		stuDeck.stu_load(list);
		
		
		
		do {
			System.out.println("학생성적프로그램");
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 이름정렬");
			System.out.println("4. 등수처리");
			System.out.println("5. 성적수정");
			System.out.println("9. 파일에 저장");
			System.out.println("0. 종료");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				stuDeck.stu_input(list);
				break;
				
			case 2:
				stuDeck.stu_print(list);
				break;
				
			case 3:
				stuDeck.stu_sortName(list);
				break;
				
			case 4:
				stuDeck.stu_rank(list);
				break;
				
			case 5:
				stuDeck.stu_update(list);
				break;
				
			case 9:
				stuDeck.stu_save(list);
				break;
			}
			
		}while(choice != 0);
		
		
		
		
		
	}

}
