package Calculations;

public class Percentage {

	public static void main(String[] args) {
		
		int sub1 = 70;
		int sub2 = 80;
		int sub3 = 85;
		int sub4 = 95;
		int sub5 = 90;
		
		int total_marks = 500;
		
		double percentage = (sub1 + sub2 + sub3 + sub4 + sub5)*100/total_marks;
		
		System.out.println("Percentage:"+percentage);

	}

}
