package Throw_And_Throws;

public class TestThrows {
	
	public static int DivideNum(int m, int n)throws ArithmeticException
	{
		int div = m / n;
		
		return div;
	}

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		TestThrows t = new TestThrows();
		
		try
		{
			System.out.println(t.DivideNum(13, 0));
			
		}catch(ArithmeticException e)
		{
			System.out.println("Number is not divisible by 0");
		}
		
		System.out.println("End");
	}

}
