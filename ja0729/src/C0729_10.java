import java.util.Scanner;

public class C0729_10 {

	public static void main(String[] args) {
		
		// 학생성적 입력
		// no - 객체선언을 하면 자동으로 번호가 증가되도록 구현
		// 이름,국어,영어,수학을 입력받아 +합계, 평균, 번호까지 입력되도록 구현
		
		Scanner scan = new Scanner(System.in);
		
		Stuscore[] stus = new Stuscore[10];
		int no = 0;
		
		while(true) {
			
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("원하는 번호를 입력하세요.");
			
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				// 프로그램 구현
				if(no>=10) {
					System.out.println("모든 학생의 성적이 입력되었습니다.");
					break;
				}
				System.out.println("[ 성적입력 ]");
				System.out.printf("%d번째 이름을 입력하세요.\n",no+1);
				String name = scan.next();
				System.out.println("국어성적을 입력하세요.");
				int kor = scan.nextInt();
				System.out.println("영어성적을 입력하세요.");
				int eng = scan.nextInt();
				System.out.println("수학성적을 입력하세요.");
				int math = scan.nextInt();
				stus[no] = new Stuscore(name,kor,eng,math);
				
				// 입력정보 : 1,홍길동,100,99,44,~~
				no++;
				break;
				
			case 2:
				System.out.println("[ 성적출력 ]");
				System.out.println("번호\t이름\t\t국어\t영어\t수학\t합계\t평균");
				System.out.println("----------------------------------------------------------");
				for(int i=0; i<no; i++) {					
					System.out.printf("%d\t%s\t\t%d\t%d\t%d\t%d\t%.2f\n",
							stus[i].no,stus[i].name,stus[i].kor,stus[i].eng,
							stus[i].math,stus[i].total,stus[i].avg);
				}
			}
		}
		
	}

}
