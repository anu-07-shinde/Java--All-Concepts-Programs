package OrdersOfArray;

import java.util.Iterator;

public class DescendingArray {

	public static void main(String[] args) {


		int[] array = {2, 4, 1, 3, 7, 9, 5};
		int temp = 0;
		
		System.out.println("Display original Array.................");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		
		}
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = i + 1; j < array.length; j++) {
				
				if(array[i] < array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
				
			}
		}
			
			System.out.println();
			
			
			System.out.println("Decending orders of Array..........");
			
			
			for (int i = 0; i < array.length; i++) {
				
			System.out.println(array[i]);
			
			
		}
		
			

	}

}
