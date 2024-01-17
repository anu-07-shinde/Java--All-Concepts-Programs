
// Counts the number of didgits........

package DoubtSession;

public class Digits {
	
	public static void main(String[] args) {
		
	int num = 2431;
	
	int count = 0;
	
	
	
	while(num > 0)
	{
		num /= 10;
		
		count ++;
		
//		System.out.println(num);
		
	}
	
	System.out.println("Number of digit: " + count);
	}

}
