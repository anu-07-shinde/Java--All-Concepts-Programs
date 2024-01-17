package EvenOddArray;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		
		int[] array = new int[] {1,2,3,4,5,6,7,8,9};
		
		System.out.print("Original Array list: ");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.print("\nEven array Elements: ");
		
		for(int i=0; i<array.length; i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		System.out.print("\nOdd array elements: ");
		
		for(int i=0; i<array.length; i++)
		{
			if(i%2 != 0)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
