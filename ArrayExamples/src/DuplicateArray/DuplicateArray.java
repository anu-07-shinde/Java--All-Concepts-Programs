package DuplicateArray;

public class DuplicateArray {

	public static void main(String[] args) {
		
		int[] array = {2,4, 2, 6, 3, 4, 7, 1, 4, 3, 8, 2};
		
		
		System.out.print("The array elements: ");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.print("\nDuplicate Array:   ");
		for(int i=0; i<array.length;i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i]==array[j])
				{
					System.out.print(array[j]+" ");
					break;
				}
			}
		}
		
	}
}
