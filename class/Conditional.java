import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conditional con = new Conditional();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input the values : 1 or 2 or x : ");
			String sel = scan.next();
			
			switch(sel) {
			case "1": con.login(); break;
			case "2": con.check(); break;
			case "x": System.exit(0);
			
			default : System.out.println("Wrong input!");
			}
			
		}

	}
	
	private void login() {
		Scanner scan_values = new Scanner(System.in);
		
		System.out.println("Enter your ID : ");
		String uname = scan_values.next();
		
		System.out.println("Enter your Password : ");
		String pwd = scan_values.next();
		
		
		// 같은지 확인하는 method
		
		if((uname.equals("celes777")) && (pwd.equals("1234"))) {
			System.out.println("Login success");
		}
		
		else {
			System.out.println("ID or Password is invalid");
		}
		scan_values.close();
	}
	
	private void check() {
		int cnt = 10;
		String msg = cnt>0? "New message exists!" : "No new message exists";
		System.out.println(msg);
	}

}
