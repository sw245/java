import java.util.Scanner;

public class C0729_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name;
		int score[] = new int[3];
		int count = 0;
		Stuscore[] stu = new Stuscore[5];	// Stuscore 타입의 배열 (Stuscore 인스턴스가 아님)
		
		int choice;
		
		while(true) {
			
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("0. 종료");
			
			
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("이름을 입력하세요.");
				name = scan.next();
				System.out.println("국어점수를 입력하세요.");
				score[0] = scan.nextInt();		
				System.out.println("영어점수를 입력하세요.");
				score[1] = scan.nextInt();
				System.out.println("수학점수를 입력하세요.");
				score[2] = scan.nextInt();
				System.out.println(name+" 학생의 성적이 저장되었습니다.");
				
				stu[count] = new Stuscore(name,score[0],score[1],score[2]);
				count++;
				break;
				
			case 2:
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				for(int i=0; i<count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
							stu[i].name,stu[i].kor,stu[i].eng,stu[i].math,
							stu[i].total,stu[i].avg);
				
			}
			
			
			// total, avg 모두 저장
			/*
			System.out.printf("정보 : %s, %d, %d, %d, %d, %.2f\n",
					stu[count].name,stu[count].kor,stu[count].eng,stu[count].math,
					stu[count].total,stu[count].avg);
			*/
			
			
		}
		
		
		}
		
	}

}
