public class Test {
    int num1 = 77;
    
    public void Printnumber() {
    	System.out.printf("%d", this.num1);
    }

    public static void main(String[] args) {
    	
    	Test m = new Test();
    	
        m.Printnumber();
    }
}