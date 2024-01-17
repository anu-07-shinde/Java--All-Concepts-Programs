package LargestArray;

public class LargestArray {
	public static void main(String[] args) {
		
		
		
		int[] array = new int[] {2, 1, 4, 9, 5, 8, 4};
		int max=array[0];
		
		System.out.print("The given array: ");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
			if(max<array[i])
			{
				max = array[i];
			}
		}
		
		System.out.print("\nLargest Array: "+max);
		
	}

}
