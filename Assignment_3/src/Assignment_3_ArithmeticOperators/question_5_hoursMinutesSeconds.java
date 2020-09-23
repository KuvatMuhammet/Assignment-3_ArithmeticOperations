package Assignment_3_ArithmeticOperators;

public class question_5_hoursMinutesSeconds {

	public static void main(String[] args) {
		
		int inputSeconds;
		int hours;
		int minutes;
		int seconds;
		
		inputSeconds=3695;
		hours=inputSeconds/3600;
		minutes=(inputSeconds%3600)/60;
		seconds=inputSeconds%60;
		
		System.out.println(hours + " hours, " + minutes + " minutes, " + " and " + seconds + " seconds ");

	}

}
