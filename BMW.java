package week3.day1;

public class BMW extends Car{
	public void applyBreak() {
		System.out.println("ABS");
	}
	public static void main(String[] args) {
	BMW obj = new BMW();
	obj.applyBreak();
	obj.sunRoof();
	obj.turnOnAc();
	
		
		
	}
	

}
