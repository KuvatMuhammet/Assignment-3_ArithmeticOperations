package Assignment_3_ArithmeticOperators;

public class question_4_swapNumbers {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		System.out.println("n1=" + num1);
		System.out.println("n2=" + num2);
		
		System.out.println("------");	
		
		int num3;
		num3=num1+num2;
		num1=num3-num1;
		num2=num3-num1;
		
		
		System.out.println("n1=" + num1);
		System.out.println("n2=" + num2);
		

	}

}
