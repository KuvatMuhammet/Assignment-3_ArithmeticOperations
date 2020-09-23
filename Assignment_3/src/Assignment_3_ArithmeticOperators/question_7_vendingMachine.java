package Assignment_3_ArithmeticOperators;

public class question_7_vendingMachine {

	public static void main(String[] args) {
		
		int change, dollar, quarter, dime, nickle, price;
		price=95;
		dollar=100;
		change=dollar-price;
		quarter=change/25;
		dime=(change%25)/10;
		nickle=(change%25)%10;
		
		System.out.println("Price in cents : " + price);
		System.out.println("Your change is " + quarter + " quarters, " + dime + " dimes, and  " + nickle + " nickles" );
		

	}

}
