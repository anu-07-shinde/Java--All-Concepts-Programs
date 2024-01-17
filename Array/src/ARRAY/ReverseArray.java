package ARRAY;

public class ReverseArray {

	public static void main(String[] args) {

		int[] a = new int[]{11, 22, 33, 44, 55};
		
		System.out.println("Original Array: ");
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		
		}
		
		
		System.out.println("Reverse Array: ");
		for(int i = a.length - 1; i >= 0; i--)
		{
			System.out.println(a[i]);
		}
	}

}
