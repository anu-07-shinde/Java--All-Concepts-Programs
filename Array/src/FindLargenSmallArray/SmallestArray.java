package FindLargenSmallArray;

public class SmallestArray {

	public static void main(String[] args) {

		int[] array = {12, 34, 2, 3, 6, 76, 56};
		
		int min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] < min)
			{
				min = array[i];
			}
			
		}
		
		System.out.println(min);

	}

}
