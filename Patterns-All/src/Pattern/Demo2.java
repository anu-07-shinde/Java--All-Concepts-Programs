package Pattern;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=10;
		
		for(int i=1; i<row; i++)
		{
			for(int j=1; j<=row; j++)
			{
				System.out.print(" ");
			}
			for(int k=row; k>=i; k--)
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		}

	}

}
