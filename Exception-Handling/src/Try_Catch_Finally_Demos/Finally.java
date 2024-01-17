package Try_Catch_Finally_Demos;

public class Finally {

	public static void main(String[] args) {
		
		int num;
		
		try
		{	
			System.out.println("This is a try block............");
			num = 10 / 0;
			System.out.println(num);
			System.out.println("Exception here...........");
			
			
		}catch (Exception e)
		{
			System.out.println("This is catch block...........");
			num = 10  / 2;
			System.out.println(num);
		}finally
		{
			System.out.println("This is a finally block.........");
		}
		
		
		
	}

}
