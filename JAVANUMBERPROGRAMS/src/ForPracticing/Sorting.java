package ForPracticing;

public class Sorting {

	public static void main(String[] args) {
		
		
		int[] array = {8, 3, 5, 1, 2};
		
		int temp = 0;
		
		
		System.out.println("Orginal array elements: ");
		
		for(int i = 0; i <= array.length; i++)
		{
			
			System.out.println(array[i]);
			
		}
		
		for(int i = 0; i <= array.length; i++)
		{
			
			for(int j = i + 1; j <= array.length; j++)
			{
				if(array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
			
			
			
		}
		System.out.println("After sorting...........");
		
		for(int i = 0; i <= array.length; i++)
		{
			System.out.println(array[i]);
		}
		
		
		
	}

}
