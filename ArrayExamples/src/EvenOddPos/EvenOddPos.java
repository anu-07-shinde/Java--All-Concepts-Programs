package EvenOddPos;

public class EvenOddPos {
	
	public static void main(String[] args) {
		
		int[] array = {2, 1, 4, 9, 5, 8, 4};
		
		System.out.print("Array Elements: ");
		for(int i=0; i<array.length; i++)
		{	
			System.out.print(array[i]+ " ");
		}
		
		System.out.print("\nArray Elements of even position: ");
		for(int i=0; i<array.length; i++)
		{
			if(i%2 == 0)
			{
				System.out.print(array[i]+" ");
			}
		}
		
		System.out.print("\nArray Elements of odd position: ");
		for(int i=0; i<array.length; i++)
		{
			if(i%2 != 0)
			{
				System.out.print(array[i]+" ");
			}
		}
		
	}

}
