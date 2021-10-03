
public class Operator_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 50;
		System.out.printf("num1 : %d, %s\n", num1,
				Integer.toBinaryString(num1));
		
		int result1 = num1 >> 1;
		
		System.out.printf("num2 : %d, %s\n", result1,
				Integer.toBinaryString(result1));
		
		int result2 = num1 << 1;
		
		System.out.printf("num3 : %d, %s\n", result2,
				Integer.toBinaryString(result2));
		
		System.out.println("===============================");
		
		// encoding, decoding
		
		int pw = 123456;
		
		int encpw, decpw;
		int key = 0x1A253B65;
		
		System.out.println("password(original) : " + pw);
		
		encpw = pw ^ key;
		System.out.println("password(encrypted) : " + encpw);
		
		decpw = encpw ^ key;
		System.out.println("password(decrypted) : " + decpw);

	}

}
