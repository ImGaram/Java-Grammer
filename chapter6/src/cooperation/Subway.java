package cooperation;

public class Subway {
	String lineNumber;		//ÁöÇÏÃ¶ ³ë¼±
	int passengerCount;		//½Â°´ ¼ö
	int money;				//¼öÀÍ
	
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) {
		this.money+=money;		//¼öÀÍ Áõ°¡
		passengerCount++;		//½Â°´ Áõ°¡
	}
	
	public void showInfo() {
		System.out.println(lineNumber+"ÀÇ ½Â°´Àº"+passengerCount+"¸í ÀÌ°í, ¼öÀÍÀº"+money+"ÀÔ´Ï´Ù.");
	}
}
