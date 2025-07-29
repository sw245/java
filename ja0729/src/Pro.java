
public class Pro {
	
	static int count = 0;
	
	int serialNo;
	String productName;
	{
		serialNo = ++count; 
	}
	
	
	Pro(){}
	Pro(String productName){
		this.productName = productName;
	}
	
}
