import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		ArrayList list = new ArrayList();
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
				
			}// switch
			
		}while(choice != 0);
		
		
		
	}

}
