package ForPracticing;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=5; 
		
		for(int i=1; i<=row; i++) //row
		{
			for(int j=row; j>=i; j--)  //col
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			
			for(int m=2; m<=i; m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
