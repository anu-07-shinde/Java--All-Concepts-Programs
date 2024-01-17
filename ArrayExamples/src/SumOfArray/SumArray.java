package SumOfArray;

public class SumArray {
	
	public static void main(String[] args) {
		

		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		System.out.print("Array Elements: ");
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+ " ");
			sum = sum + array[i];
		}
		
		System.out.print("\nSum: "+sum);
		
	}

}
