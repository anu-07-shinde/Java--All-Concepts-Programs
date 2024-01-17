package Pattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 15;
		for(int i = 1; i <= row; i++)
		{
			for(int j = row; j >= i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
