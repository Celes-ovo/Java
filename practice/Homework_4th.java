/*
 * ���ǹ� �н��� ���� �ǽ� �ڵ� Conditional.java �� ���� �䱸���׿� �°� �����ϰ� ������ �ڵ带 ���� ÷�ΰ� �ƴ� ���� �ۼ����� �����ؼ� ����

- ���� �ڵ�� while ���� ����� �޴����� x �� ������ ���� �ȴ�.

- �߸��� ���̵� ��й�ȣ�� �α����� ��� �ٽ� �޴��� ���ư��� �Ǿ� �ִµ�

- �̶� �α��� �޴��� ���� �α��� ���а� 3��° �Ǵ� ��� ���α׷��� ���� ����(System.exit(0)) �ϵ��� �Ѵ�.



# ���� ����

- ������ for ���� ������� ����(���� ���н� ����)

- �α��� ������ ���� �޴��� ���ƿͼ� �ٽ� �α��� �޴��� �����ϰ� �ٽ� �õ� -> ���� -> 3ȸ ���н� �ڵ� ����
*/


import java.util.Scanner;

public class Homework_4th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Homework_4th con = new Homework_4th();
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
	
	// 3�� Ȯ���ϴ� ����.
	int three_count = 0;
	
	
	private void login() {
		Scanner scan_values = new Scanner(System.in);
		
		System.out.println("Enter your ID : ");
		String uname = scan_values.next();
		
		System.out.println("Enter your Password : ");
		String pwd = scan_values.next();
		
		
		// ������ Ȯ���ϴ� method
		
		if((uname.equals("celes777")) && (pwd.equals("1234"))) {
			System.out.println("Login success");
		}
		
		else {
			System.out.println("ID or Password is invalid");
			three_count++;
			System.out.println("Your error count is : " + three_count);
			
			if(three_count == 3) {
				System.exit(0);
			}
			
		}
		
	}
	

			
		
	private void check() {
		int cnt = 10;
		String msg = cnt>0? "New message exists!" : "No new message exists";
		System.out.println(msg);
	}

}