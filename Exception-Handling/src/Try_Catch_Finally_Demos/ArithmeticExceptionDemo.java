package Try_Catch_Finally_Demos;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try {
			int res = 10 / 0;
			
		}catch (ArithmeticException e)
		{
			System.out.println(e);
			
			int res = 10 / 2;
			System.out.println(res);
		}
		finally {
			System.out.println("Finallay block");
		}
		
		System.out.println("End");
		
	}

}
