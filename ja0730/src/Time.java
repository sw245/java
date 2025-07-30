
public class Time {

	private int hour;
	private int minute;
	private int second;
	
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour){
		if(hour > 23 || hour<0) {
			hour = 0;
		}
		this.hour = hour;
	}
	
}
