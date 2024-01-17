package ForPracticing;

public class Palindrome {
	

	public static void main(String[] args) {
		
		
		int num=4541;
		int rem, sum=0;
		
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}else
		{
			System.out.println("Not palindrome");
		}
	}
}
