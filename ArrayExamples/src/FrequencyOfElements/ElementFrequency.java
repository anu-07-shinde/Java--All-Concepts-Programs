package FrequencyOfElements;

import java.util.Arrays;

public class ElementFrequency {
	
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 1, 2, 1, 5, 6, 7, 4, 6, 7, 5, 6};
		int count =1;
		
		System.out.println("Original Array: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
			
			for(int j=i+1; j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					count++;
					array[j]= -1;
				}
			}
		}
			System.out.println("\n****************************************");
			System.out.println("    Elements        |        Frequencuy");
			System.out.println("****************************************");
			
			for(int i=0; i<array.length; i++)
			{
			
				if(array[i] != -1)
				{
					System.out.println("        "+array[i]+"                  "+count);
				}
			}
			
		}
		
}	
	
		
	
 
