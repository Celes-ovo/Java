package com.dinfree.java.part1;
/*
 Methods.java 코드를 참고해서 다음과 같은 예제를 직접 작성해 실행해 본 다음 제출 할 것.


- 학과와 학번, 이름을 인자로 받아 출력하는 printInfo() 메서드를 만들고 main 에서 인스턴스를 통해 호출하는 구조로 구현할것.

- 학과와 이름은 String

- 학번은 int
*/
public class Homework {
	
	void printinfo(String...name) {
		for(String s : name) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		
		Methods qwe = new Methods();
		qwe.printinfo("의용생체공학과", "201738407", "김상민");

	}

}
