package BubbleSorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array = {8, 7, 3, 4, 5};
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length; j++) {
				
				if(array[i]>array[j])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
					
				}
				
				
			
			}
			System.out.println(array[i]);
					
		}
	

	}

}
