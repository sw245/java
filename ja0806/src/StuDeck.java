import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuDeck {

	String[] title = {
			"번호","이름","국어","영어","수학","합계","평균","등수"
	};
	
	Scanner sc = new Scanner(System.in);
	
	
	// 파일 불러오기
	public void stu_load(ArrayList<Student> list) {
		try {
			FileReader fr = new FileReader("c:/aaa/student.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while(true) {
				line = br.readLine();
				if(line == null) break;
				String[] str = line.split(",");
				int kor = Integer.parseInt(str[2]);
				int eng = Integer.parseInt(str[3]);
				int math = Integer.parseInt(str[4]);
				int rank = Integer.parseInt(str[7]);
				list.add(new Student(str[1],kor,eng,math,rank));
			}
			
			br.close();
			fr.close();
			
		} catch (Exception e) {
			System.out.println("에러 발생");
			e.printStackTrace();
		}
		
	} // load
	
	
	
	
	
	// 1. 성적입력
		public void stu_input(ArrayList<Student> list) {
			System.out.println("성적입력");
			System.out.println("등록할 학생의 이름을 입력하세요.");
			String name = sc.next();
			int[] score = new int[3];
			for(int i=0; i<score.length; i++) {
				System.out.println(title[i+2]+"성적을 입력하세요.");
				score[i] = sc.nextInt();
			}
			list.add(new Student(name,score[0],score[1],score[2]));
			
			System.out.println("성적 입력 완료");
			
		}
	
	
	
	
	// 2. 출력
	public void stu_print(ArrayList<Student> list) {
		System.out.println("학생성적 출력");
		for(String str : title) {
			System.out.print(str+"\t");
		}
		System.out.println();
		for(Student stu : list) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					stu.getNo(),stu.getName(),stu.getKor(),stu.getEng(),stu.getMath(),
					stu.getTotal(),stu.getAvg(),stu.getRank());
		}
		
	}



	// 3. 이름정렬
	public void stu_sortName(ArrayList<Student> list) {
		System.out.println("이름정렬");
		System.out.println("1. 순차정렬");
		System.out.println("2. 역순정렬");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:

			list.sort(new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					return o2.getName().compareTo(o1.getName());
					
					// compareTo
					
					
				}
			}); // sort
			
		case 2:
			list.sort(new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					return o1.getName().compareTo(o2.getName());
				}
			}); // sort
			
		} // switch
		
		System.out.println("정렬 완료");
		
		
		
		
	} // sortName()




	// 4. 등수처리
	public void stu_rank(ArrayList<Student> list) {

		System.out.println("등수처리");
		
		for(Student stu_r : list) {
			int tRank = 1;
			for(Student s : list) {
				if(stu_r.getTotal() < s.getTotal()) {
					tRank++;
				}
			} // s
			stu_r.setRank(tRank);
			
		} // stu_r
		
		System.out.println("등수처리 완료");
		
	}

	
	// 5. 성적수정
	public void stu_update(ArrayList<Student> list) {
		
		System.out.println("수정할 학생의 이름을 입력");
		String name = sc.next();
		int num = -1;
		int choice = 10;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				num = i;
				break;
			}
		} // for
		if(num != -1) {
			
			while(true) {
				System.out.println("과목을 선택하세요.");
				System.out.println("1. 국어");
				System.out.println("2. 영어");
				System.out.println("3. 수학");
				System.out.println("0. 처음화면으로");
				
				choice = sc.nextInt();
				if(choice == 0) return;
				
				System.out.println(title[choice+1]+"점수를 입력하세요.");
				int score = sc.nextInt();
				switch(choice) {
				case 1:
					list.get(num).setKor(score);
					break;
				case 2:
					list.get(num).setEng(score);
					break;
				case 3:
					list.get(num).setMath(score);
					break;
				}
				list.get(num).total();
				list.get(num).avg();
				
				System.out.println("수정이 완료되었습니다.");
				
			}
			
		}else if(num == -1) {
			System.out.println(name+" 학생을 찾지 못했습니다.");
		}
		
		
		
	}
	
	

	// 9. 파일에 저장
	public void stu_save(ArrayList<Student> list) {

		try {
			FileWriter fw = new FileWriter("c:/aaa/student.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(Student stu : list) {
				String str = String.format("%d,%s,%d,%d,%d,%d,%f,%d\n",
						stu.getNo(),stu.getName(),stu.getKor(),stu.getEng(),stu.getMath(),
						stu.getTotal(),stu.getAvg(),stu.getRank());
				bw.write(str);
			}
			
			bw.close();
			fw.close();
			
			System.out.println("저장 완료");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		
		
	} // save



	
	
	
	
	
	
	
} // class
