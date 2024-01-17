package ForPracticing;

public class ReverseNum {
	public static void main(String[] args) {
		
		
		int num=10;
		System.out.println("Original NO:");
		
		for(int i=0; i<=num; i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("Reverse number: ");
		for(int i=num; i>=0; i--)
		{
			System.out.print(i+ " ");
		}
		
	}

}
