package ReverseArray;

public class ReverseArray {
	

	public static void main(String[] args) {
		
		int[] array = {2, 1, 4, 9, 5, 8, 4};
		
		System.out.print("Original Array: ");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.print("\nReverse Array: ");
		for(int i=array.length-1; i>=0; i--)
		{
			System.out.print(array[i]+" ");
		}
		
	}
}
