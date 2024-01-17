package Sorting;

public class SortArray {
	public static void main(String[] args) {
		
		
		int[] array = new int[] {9, 5, 7, 3, 6, 1};
		
		
		System.out.print("Original Array: ");
		
		for(int i = 0; i<array.length; i++)
		{
			
			System.out.print(array[i]+" ");
			for(int j=0; j<=i; j++)
			{
				if(array[i]>array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("\nSorted Array:");
		for(int i = 0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}

}
