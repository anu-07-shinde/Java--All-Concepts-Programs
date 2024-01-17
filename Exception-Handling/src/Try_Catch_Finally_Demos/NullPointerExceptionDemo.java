package Try_Catch_Finally_Demos;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try
		{
			String s = null;
			System.out.println(s.length());
			
		}catch(NullPointerException e)
		{
			System.out.println(e);
			String s = "Anuradha";
			System.out.println(s.length());
			
		}finally
		{
			System.out.println("Finally block..........");
		}
		
		System.out.println("End");

	}

}
