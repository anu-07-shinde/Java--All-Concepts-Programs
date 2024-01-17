package ForPracticing;

public class RandomeNumber {

	public static void main(String[] args) {
		
		int min=200;
		int max=400;
		
		System.out.println("The randome number is: ");
		
		double x = Math.random()*(max-min+1)+min;
		
		System.out.println(x);
		
		
		System.out.println("The integer random number");
		
		int y = (int)(Math.random()+(max-min+1)+min);
		System.out.println(y);
		
	}
}
