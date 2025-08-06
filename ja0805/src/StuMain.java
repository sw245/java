import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		StuDeck stuDeck = new StuDeck();
		int choice = 0;
		
		
//		String name = "";
//		int kor, eng, math = 0;
//		String[] title = {
//				"번호","이름","국어","영어","수학","합계","평균","등수"
//		};
		
		
		
		// 파일 읽어오기
		stuDeck.stu_FileRead(list);
		
		do {
			choice = stuDeck.stu_menu();
			
			switch(choice){
				
			case 1:
				stuDeck.stu_input(list);
				break;
				
			case 2:
				stuDeck.stu_output(list);
				break;
				
			case 3:
				stuDeck.stu_update(list);
				break;
				
			case 4:
				stuDeck.stu_remove(list);
				break;
				
			case 5:	// 등수처리
				stuDeck.stu_rank(list);
				break;
				
			case 6:
				stuDeck.stu_sortName(list);;
				break;
				
			case 7:
				stuDeck.stu_sortTotal(list);
				break;
				
			case 8:
				stuDeck.stu_sortNo(list);
				break;
				
			case 9:
				stuDeck.stu_FileSave(list);
				break;
			}
			
		}while(choice != 0);
		
		
	}

}
