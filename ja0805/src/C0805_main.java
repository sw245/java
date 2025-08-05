import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class C0805_main {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		String name = "";
		int kor, eng, math = 0;
		
		// 파일 불러오기
		
		try {
			FileReader fr = new FileReader("c:/aaa/student.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				String[] str = line.split(",");
				name = str[1];
				kor = Integer.parseInt(str[2]);
				eng = Integer.parseInt(str[3]);
				math = Integer.parseInt(str[4]);
				
				list.add(new Student(name,kor,eng,math));
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		// 4명 성적 객체에 담아서 출력
		
		while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 파일저장");
			System.out.println("--------------------");
			System.out.println("원하는 번호를 입력하세요.");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				break;
				
			case 2:
				for(int i=0; i<list.size(); i++) {
					Student s = list.get(i);
					System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d\n",
							s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),
							s.getTotal(),s.getAvg(),s.getRank());
				} // for
				break;
			
			case 3:
				// 임시 1개 저장
				list.add(new Student("김구",100,100,100));
				
				// 파일 저장 
				try {
					FileWriter fw = new FileWriter("c:/aaa/student.txt",false);	// - true: 이어쓰기, false: 덮어쓰기
					BufferedWriter bw = new BufferedWriter(fw);
					for(int i=0; i<list.size(); i++) {
						Student s = list.get(i);
						String str = String.format("%d,%s,%d,%d,%d,%d,%f,%d\r\n",
								s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
						bw.write(str);
					} // for
					bw.close();
					fw.close();
					
					System.out.println("파일 저장 완료");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			} // switch
			
			
		} // while
		
		
	} // main

} // class
