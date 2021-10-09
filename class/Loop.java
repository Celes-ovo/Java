package com.dinfree.java.part1;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int power = 13;
		String members[] = {"abc", "def", "ghi"};
		
		//for(int i=1; i<=10; i++)
		for(int i=0; i<10; i++) {
			System.out.println(i+1);
		}
		
		System.out.println("============");
		
		for(int i=0; i<members.length; i++) {
			System.out.println(members[i]);
		}
		
		System.out.println("============");
		
		for(String name : members) {
			System.out.println(name);
		}
		
		System.out.println("============");
		
		while(power>10) {
			System.out.println("Go!!");
			power--;
		}
		System.out.println("Done");


	}

}
