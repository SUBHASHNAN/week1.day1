package week1.day1;

public class Mobile {

	public void sendsms() {
		
		System.out.println("Hello everyone");	
	}
	public void takesnapshot() {
		System.out.println("click power and volume button as same");
		
	}
	public static void main(String[] args) {
		Mobile obj = new Mobile ();
		obj.sendsms();
		obj.takesnapshot();
		
	}
}
