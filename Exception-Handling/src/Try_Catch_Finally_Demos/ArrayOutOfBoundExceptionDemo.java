package Try_Catch_Finally_Demos;

public class ArrayOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		
		try
		{
			int[] array = new int[5];
			
			array[7] = 67;
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block...........");
		}
		
		

	}

}
