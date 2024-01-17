package Pattern;

public class PrintPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				if(j == 3)
				{
					continue;
				
				}
//				continue;
				System.out.print("*");
		}
			System.out.println();
	}
	}
}
	

