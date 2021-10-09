
public class Operator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 30;
		int num2 = 14;
		
		// /와 %의 차이
		int result1 = num1 * num2;
		int result2 = num1 % num2;
		
		
		System.out.printf("Result : %d\n", num2);
		num2++;
		System.out.printf("++Result : %d\n", num2);
		System.out.println("=============================");
		
		System.out.printf("Result 1 : %d\n", result1);
		System.out.printf("Result 2 : %d\n", result2);
	
		System.out.println("=============================");
		
		/*
		 * ++i, i++의 difference
		 * */
		
		System.out.printf("Result : %d\n", num2);
		System.out.printf("Result : %d\n", num2++);
		System.out.printf("Result : %d\n", --num2);

		
		
		
		// %d, %t
		for(int i=0; i<num1+1; i++) {
			System.out.printf("%d\t", i);
			
			if(i % 10 == 0) {
				System.out.println();
			}
		}

	}

}
