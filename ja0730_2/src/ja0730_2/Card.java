package ja0730_2;

public class Card {

	
	private int number;
	private String kind;
	private String[] n_num = {
			"","A","2","3","4","5","6","7","8","9","10","J","Q","K"
	};
	
	Card(){}
	Card(int number, String kind){
		this.number = number;
		this.kind = kind;
	}
	
	
	
	
	
	public int getNumber() {
		return number;
	}
	public String getKind() {
		return kind;
	}
	
	
	
	
	public void setNumber(int number) {
		this.number = number;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%s,%s]",n_num[number],kind);
	}
	
	
}
