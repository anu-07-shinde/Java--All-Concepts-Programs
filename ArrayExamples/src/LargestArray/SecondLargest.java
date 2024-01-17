package LargestArray;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		int[] array = new int[] {2, 1, 4, 9, 5, 8, 4};
		
		System.out.print("Given array: ");
		for(int i=0; i<array.length;i++)
		{
			
			System.out.print(array[i]+" ");
			for(int j=0; j<i; j++)
			{
				if(array[i]>array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.print("\nSecondLargest Array: "+ array[1]);
		System.out.print("\nThirdLargest Array: "+ array[2]);
		
	}

}
