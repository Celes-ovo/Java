public class Methods {
	
	String name;
	
	Methods() {
		name = "�ö��̰�";
		System.out.printf("������ : %s\n", name);
	}
	
	
	void printname() {
		System.out.printf("name : \n", this.name);
	}
	
	void printname2(String name) {
		System.out.printf("string name : %s\n", name);
		System.out.printf("main name : %s\n", this.name);
	}
	
	void printname3(String...name) {
		//System.out.printf("string name : %s\n", name);
		for(String s : name) {
			System.out.println(s);
		}
	}
	
	int calc(int num1, int num2) {
		return num1 +num2;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods m = new Methods();
		m.printname();
		m.printname2("��ī���ƽ�");
		m.printname3("�ö��̰�", "��ī���ƽ�", "������");
		
		System.out.printf("result : %d\n", m.calc(2, 6));

	}

}