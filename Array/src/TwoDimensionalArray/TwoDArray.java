package TwoDimensionalArray;

public class TwoDArray {
	
	public static void main(String[] args) {
		int [] [] a = new int[][] {{10, 20}, {11, 12}};
		
		
		for (int[] arr1 : a) {
			
//			System.out.println(arr1);
			
		}
		
		for (int[] arr2 : a) {
			
			for (int val : arr2) {
				
				System.out.println(val);
			}
		}
		
		
	}

}
