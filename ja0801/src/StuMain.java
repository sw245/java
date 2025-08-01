import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Stuscore> list = new ArrayList<Stuscore>();
		StuDeck stuDeck = new StuDeck();
		
		int choice;
		
		
		do {
			// 상단메뉴 출력
			choice = stuDeck.menu_print();
			
			
			switch(choice) {
			case 1:
				stuDeck.stu_input(list);
			
				break;
			
			case 2:
				stuDeck.stu_output(list);
				
				break;
				
			case 3:		// 성적 수정
				break;
				
			case 4:
				System.out.println("삭제할 학생의 이름을 입력하세요.");
				String name = sc.next();
				int temp = 0;
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).getName().contains(name)) {
						String del_name = list.get(i).getName(); 
						System.out.printf("%s 학생을 삭제하시겠습니까?\n",del_name);
						System.out.println("1. 삭제");
						System.out.println("2. 취소");
						int ch_del = sc.nextInt();
						if(ch_del == 1) {
							list.remove(i);
						}
						System.out.println(del_name+" 학생이 삭제되었습니다.");
						temp = 1;
					}
				}
				if(temp == 0) {
					System.out.println("찾고자 하는 학생이 없습니다.");
				}
				
				break;
				
			}// switch
			
		}while(choice != 0);

	}

}
