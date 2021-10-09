package com.dinfree.java.part1;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201738407 의용생체공학과 김상민");
		System.out.println("<구구단>\n");
		
		for(int i=2; i<=9; i++) {
			System.out.printf("# %d단\n", i);
			for(int j=1; j<=9; j++) {
				
				int k = i*j;
				System.out.printf("%d * %d = %d\n", i, j, k);
				
				if(j==9) {
					System.out.println("");
				};
			}
		}

	}

}
