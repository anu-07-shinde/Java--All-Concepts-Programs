package Recursion;

public class NaturalNum {

	
	public static void sumNum(int i, int n, int sum)
	{
		if(i==n)
		{
			sum+=i;
			System.out.println(sum);
			return;
		}
		
		sum+=i;
		sumNum(i+1, n, sum);
		System.out.println();
	}
	
	public static void main(String[] args) {
		sumNum(1,5,0);
	}
}


