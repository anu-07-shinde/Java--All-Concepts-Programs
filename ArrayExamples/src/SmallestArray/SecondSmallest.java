package SmallestArray;

public class SecondSmallest {
	
	public static void main(String[] args) {
		
		int[] array = {11, 23, 13, 29, 17, 2, 7, 5};
		
		System.out.print("Given Array Elements: ");
		for(int i=0; i<array.length;i++)
		{
			System.out.print(array[i]+" ");
			for(int j=0; j<i; j++)
			{
				if(array[i]<array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.print("\nSecond smallest array: "+array[1]);
		
	}
	
	

}
