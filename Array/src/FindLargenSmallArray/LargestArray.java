package FindLargenSmallArray;

public class LargestArray {

	public static void main(String[] args) {

		int[] array = {12, 34, 64, 11, 2, 78};
		
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] > max)
			{
				max = array[i];
				
			}
			
			
		}
		System.out.println("Largest array present in given array: " + max);

	}

}
