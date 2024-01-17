package ArrayListDemo;

import java.util.Scanner;

public class DeleteArray {
	
	public static void main(String[] args) throws Exception {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		System.out.print("Enter the Array elements: ");
		for(int i=0; i<array.length; i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.print("Enter the position you want to delete elements: ");
		
		int position = sc.nextInt();
		
		int [] newArray = new int[array.length-1];
		
		for(int i=0; i<size; i++)
		{
			
			if(i<position)
			{
				newArray[i]=array[i];
			}
		    else if(position==i)
			{
				continue;
			}else 
			{
				newArray[i-1]=array[i];
			}
		}
		
		for(int i=0; i<size-1; i++)
		{
			System.out.println(newArray[i]);
		}
		
	}

}
