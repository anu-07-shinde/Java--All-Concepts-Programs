package Throw_And_Throws;

public class TestThrow {
	
	
	public static void CheckNum(int num)
	{
		if(num < 1)
		{
			throw new ArithmeticException("Number is negative or number is not calculate square");
		}else
		{
			System.out.println("Square of " + num + " is: " +  (num * num));
		}
	}

	public static void main(String[] args) {
		
		TestThrow t = new TestThrow();
		
		t.CheckNum(12);
		t.CheckNum(0);
		
		
		
	}

}
