
public class C0729_12 {

	public static void main(String[] args) {

		Pro[] p = new Pro[10];
		
		// serialNo 자동부여
		p[0] = new Pro();
		p[0].productName = "스마트폰";
		
		p[1] = new Pro();
		p[1].productName = "스마트폰";
		
		p[2] = new Pro();
		p[2].productName = "스마트폰";
		
		p[3] = new Pro();
		p[3].productName = "스마트폰";
		
		p[4] = new Pro();
		p[4].productName = "스마트폰";
		
		
		
		p[5] = new Pro("스마트폰");
		p[6] = new Pro("스마트폰");
		p[7] = new Pro("스마트폰");
		p[8] = new Pro("스마트폰");
		p[9] = new Pro("스마트폰");
		
		
		for(int i=0; i<p.length; i++) {
			System.out.println(p[i].serialNo); 
		}
		
		
	}

}
