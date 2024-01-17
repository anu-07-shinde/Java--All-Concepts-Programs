package OrdersOfArray;

public class AscendingArray {

	public static void main(String[] args) {


		int[] array = {2, 4, 1, 3, 7, 9, 43, 23, 54};
		
		int temp = 0;
		
		
		System.out.println("Display Original Array.............");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}
		
		
		for (int i = 0; i < array.length; i++) {
			
			
			for (int j = i + 1; j < array.length; j++) {
				
				
				if(array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
		
		}
		System.out.println();
		
		System.out.println("Array in Ascending Order.........");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}

	}

}
