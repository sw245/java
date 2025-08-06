import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
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
		System.out.println("6. 이름으로 정렬");
		System.out.println("7. 합계 점수로 정렬");
		System.out.println("8. 번호로 정렬");
		System.out.println("9. 파일 저장");			// 완료
		System.out.println("0. 종료");				// 완료
		System.out.println("-------------------------------");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = sc.nextInt();
		
		return choice;
	}
	
	
	// 1. 학생정보 입력
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
	
	
	
	
	// 2. 학생정보 출력
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
	
	
	// 3. 학생성적 수정
	void stu_update(ArrayList<Student> list) {
		System.out.println();
		System.out.println("[ 학생성적 수정 ]");
		System.out.println("수정하려는 학생의 이름을 입력하세요.");
		String name = sc.next();
		int num = 0;
		int temp = 0;
		for(int i=0; i<list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				System.out.println(name+" 학생이 선택되었습니다.");
				num = i;
				temp = 1;
				break;
			}
			/* // 여러 이름 검색
			if(list.get(i).getName().contains(name)) {
				System.out.println("이름 : "+list.get(i).getName());
				temp = 1;
			}
			*/
		} // for
		if(temp == 1) {
			System.out.println("수정할 과목을 선택하세요.");
			System.out.println("1. 국어");
			System.out.println("2. 영어");
			System.out.println("3. 수학");
			System.out.println("-------------------------------");
			System.out.println("원하는 번호를 입력하세요.");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println(name+" 학생의 국어점수는 "+list.get(num).getKor()+"점입니다.");
				System.out.println("새로운 점수를 입력하세요.");
				list.get(num).setKor(sc.nextInt());
				break;
				
			case 2:
				System.out.println(name+" 학생의 영어점수는 "+list.get(num).getEng()+"점입니다.");
				System.out.println("새로운 점수를 입력하세요.");
				list.get(num).setEng(sc.nextInt());
				break;
				
			case 3:
				System.out.println(name+" 학생의 수학점수는 "+list.get(num).getMath()+"점입니다.");
				System.out.println("새로운 점수를 입력하세요.");
				list.get(num).setMath(sc.nextInt());
				break;
			}
			list.get(num).total();
			list.get(num).avg();
			System.out.println("수정이 완료되었습니다.");
			
		}else if(temp == 0) {
			System.out.println(name+"에 대한 검색결과가 없습니다.");
		}
		
		
	} // update
	
	
	
	// 4. 학생성적 삭제
	void stu_remove(ArrayList<Student> list) {
		System.out.println("[ 학생성적 삭제 ]");
		System.out.println("삭제할 학생의 이름을 입력하세요.");
		String name = sc.next();
		int temp = 0;
		int num = 0; 
		for(int i=0; i<list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				System.out.println(name+" 학생이 선택되었습니다.");
				temp = 1;
				num = i;
				break;
			}
		}// for
		
		if(temp == 1) {
			System.out.println(name+" 학생의 정보를 삭제하시겠습니까?");
			System.out.println("1. 예");
			System.out.println("2. 아니오");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				list.remove(num);
				System.out.println(name+" 학생의 정보가 삭제되었습니다.");
				break;
				
			case 2:
				System.out.println("취소되었습니다.");
				break;
				
			} // switch
			
		}else if(temp == 0) {
			System.out.println(name+" 학생을 찾지 못했습니다.");
		}
		
		
		
	} // remove
	
	
	
	// 5. 등수처리
	void stu_rank(ArrayList<Student> list) {
		System.out.println("[ 등수처리 ]");
		
		for(int i=0; i<list.size(); i++) {
			int trank = 1;
			for(int j=0; j<list.size(); j++) {
				if(list.get(i).getTotal() < list.get(j).getTotal()) {
					trank++;
				}
				
			}
			list.get(i).setRank(trank);
		}
		
		System.out.println("등수처리가 완료되었습니다.");
	}
	
	
	
	
	// 6. 이름으로 정렬
	void stu_sortName(ArrayList<Student> list) {
		System.out.println("[ 이름으로 정렬 ]");
		System.out.println("1. 이름 순차정렬");
		System.out.println("2. 이름 역순정렬");
		System.out.println("0. 취소");
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			list.sort(new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return o2.getName().compareTo(o1.getName());
				}
			});
		case 2:
			list.sort(new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			
		} // switch
		
		System.out.println("정렬되었습니다.");
		
	}
	
	
	// 7. 합계 점수로 정렬
	void stu_sortTotal(ArrayList<Student> list) {
		System.out.println("[ 합계점수로 정렬 ]");
		System.out.println("1. 합계 순차정렬");
		System.out.println("2. 합계 역순정렬");
		System.out.println("0. 취소");
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			list.sort(new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return (o1.getTotal() - o2.getTotal());
				}
			});
		case 2:
			list.sort(new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return (o2.getTotal() - o1.getTotal());
				}
			});
			
		} // switch
		
		System.out.println("정렬되었습니다.");
		
	}
	
	
	
	// 8. 번호로 정렬
	void stu_sortNo(ArrayList<Student> list) {
		System.out.println("[ 번호로 정렬 ]");
		System.out.println("1. 번호 순차정렬");
		System.out.println("2. 번호 역순정렬");
		System.out.println("0. 취소");
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			list.sort(new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return (o1.getNo() - o2.getNo());
				}
			});
		case 2:
			list.sort(new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					return (o2.getNo() - o1.getNo());
				}
			});
			
		} // switch
		
		System.out.println("정렬되었습니다.");
		
	}
	
	
	
	// 9. 학생정보 파일 저장
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
