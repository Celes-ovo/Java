package com.dinfree.java.part1;

public class Variables {
	
	// 멤버 변수, instance 변수
	int num1;
	
	// 멤버 변수, class 변수
	static int num2 = 80; 
	
	/*
	1 static이 붙은 변수들은 객체들이 다 같이 공유하는 데이터를 의미한다.

	2 static이 붙은 메소드들은 객체들의 데이터와 관계없는 완벽하게 공통적인 로직을 정의할 때 사용한다.

	3 따라서 static 메소드에서는 인스턴스 변수나 객체의 메소드를 사용할 수 없다. 
	*/
	
	public void printname(String name) {
		
		// local variables
		String printsome = name + " 최고야!";
		int num4 = this.num1;
		
		System.out.println(printsome);
		System.out.println(num4);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//mc라는 변수를 통해 instance들을 사용할 수 있도록 한다.
		Variables mc = new Variables();
		mc.num1 = 330;
		mc.printname("플라이곤");
		
		System.out.println(mc.num1);
		System.out.println(Variables.num2);
		
		System.out.printf("%d, %d", mc.num1, Variables.num2);

	}

}
