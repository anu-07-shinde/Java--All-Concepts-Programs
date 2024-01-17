package Try_Catch_Finally_Demos;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		
		try
		{
			String s = "Anu";
			
			int i = Integer.parseInt(s);
			
//			System.out.println(i);
			
		}catch (Exception e) {
			
			System.out.println(e);
			
			int s = 123;
			System.out.println();
			
			
		}finally
		{
			System.out.println("finally block.........");
		}
		
	}

}
