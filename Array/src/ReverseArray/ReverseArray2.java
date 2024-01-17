package ReverseArray;

public class ReverseArray2 {

	public static int[] reverseArayy(int[] originalArray)
	{
		int size = originalArray.length;
		
		int[] ansArray = new int[size];
		
		int j = 0;
		for(int i = originalArray.length - 1; i >= 0; i--)
		{
			ansArray[j] = originalArray[i];
			j++;
		}
		return ansArray;
	}

	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int[] ans = reverseArayy(arr);
		int j;
		System.out.println(ans);
		
	}
}
