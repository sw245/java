import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {

	Scanner sc = new Scanner(System.in);
	
	private String[] title = {
			"번호","이름","국어","영어","수학","합계","평균","등수"
	};
	
	
	// 파일 읽어오기 메서드
	public void stu_FileRead(ArrayList<Student> list) {
		try {
			FileReader fr = new FileReader("c:/aaa/student.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				String[] str = line.split(",");
				String name = str[1];
				int kor = Integer.parseInt(str[2]);
				int eng = Integer.parseInt(str[3]);
				int math = Integer.parseInt(str[4]);
				
				list.add(new Student(name,kor,eng,math));
				
			}
			
			br.close();
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // stuRead
	
	
	
	// 상단 메뉴 출력 메서드
	int stu_menu() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적 입력");			// 완료
		System.out.println("2. 성적 출력");			// 완료
		System.out.println("3. 성적 수정");
		System.out.println("4. 성적 삭제");
		System.out.println("5. 등수처리");
		System.out.println("6. 학생목록 정렬");
		System.out.println("7. 파일 저장");			// 완료
		System.out.println("0. 종료");				// 완료
		System.out.println("-------------------------------");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = sc.nextInt();
		
		return choice;
	}
	
	
	// 학생정보 입력
	void stu_input(ArrayList<Student> list) {
		System.out.println();
		System.out.println("[ 학생성적 입력 ]");
		System.out.println("등록할 학생의 이름을 입력하세요. (0: 취소)");
		String name = sc.next();
		if(name.equals("0")) return;	// 메서드 실행 중지
		int[] score = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println(name+" 학생의 "+title[i+2]+"성적을 입력하세요.");
			score[i] = sc.nextInt();
		}
		list.add(new Student(name,score[0],score[1],score[2]));
		System.out.println(name+" 학생의 성적 입력이 완료되었습니다.");
	}
	
	
	
	
	// 학생정보 출력
	void stu_output(ArrayList<Student> list) {
		System.out.println("[ 학생성적 출력 ]");
		for(int i=0; i<title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------------");
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			System.out.printf(
					"%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank()
					);
			System.out.println();
		}
	} // stu_output
	
	
	
	
	// 학생정보 파일 저장
	void stu_FileSave(ArrayList<Student> list) {
		
		try {
			FileWriter fw = new FileWriter("c:/aaa/student.txt");
			BufferedWriter br = new BufferedWriter(fw);
			
			for(int i=0; i<list.size(); i++) {
				Student s = list.get(i);
				String str = String.format("%d,%s,%d,%d,%d,%d,%f,%d\r\n",
						s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
				br.write(str);
			}
			 
			br.close();
			fw.close();
			
			System.out.println("파일 저장이 완료되었습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일을 불러오는 과정에서 오류가 발생했습니다.");
		}
		
	}
	
	
}
