package week3.day1;

public class Students {
	public void getStudentInfo(String name) {
		System.out.println(name);
		}
	public void getStudentInfo(int ID) {
		System.out.println(ID);
	}
	public void getStudentInfo(long phone) {
		System.out.println(phone);
	}
	public void getStudentInfo(String email,String name) {
		System.out.println(email);
	}
public static void main(String[] args) {
	Students obj = new Students();
	obj.getStudentInfo("hari");
	obj.getStudentInfo(123);
	obj.getStudentInfo(8807553856L);
	obj.getStudentInfo("hkamzn@amazon.com","hari");
	
	
}
}
