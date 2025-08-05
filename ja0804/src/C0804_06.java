import java.util.ArrayList;

public class C0804_06 {

	public static void main(String[] args) {

		ArrayList<Stu> list = new ArrayList<Stu>();	// 제너릭스
		
		list.add(new Stu("홍길동",100,100,100));
		list.add(new Stu("유관순",90,90,100));
		list.add(new Stu("이순신",80,80,90));
		list.add(new Stu("강감찬",70,90,100));
		list.add(new Stu("김구",100,80,100));
		
		/*
		for(int i=0; i<list.size(); i++) {
			System.out.printf("%s\t%d\t%d\t%d\n",
					list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath());
		}
		*/
		
		
		Stu stu = new Stu();
		
		stu.setKor(110);
		stu.setKor(70);
		stu.setKor(-20);
		
		System.out.println(stu.getKor());
		
		
	}

}
