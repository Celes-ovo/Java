/*
 * 조건문 학습에 사용된 실습 코드 Conditional.java 를 다음 요구사항에 맞게 수정하고 수정된 코드를 파일 첨부가 아닌 직접 작성란에 복사해서 제출

- 현재 코드는 while 문을 사용해 메뉴에서 x 를 눌러야 종료 된다.

- 잘못된 아이디나 비밀번호로 로그인할 경우 다시 메뉴로 돌아가게 되어 있는데

- 이때 로그인 메뉴를 통한 로그인 실패가 3번째 되는 경우 프로그램을 강제 종료(System.exit(0)) 하도록 한다.



# 주의 사항

- 별도의 for 문은 사용하지 않음(아직 미학습 상태)

- 로그인 실패후 메인 메뉴로 돌아와서 다시 로그인 메뉴를 선택하고 다시 시도 -> 실패 -> 3회 실패시 자동 종료
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
	
	// 3번 확인하는 변수.
	int three_count = 0;
	
	
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