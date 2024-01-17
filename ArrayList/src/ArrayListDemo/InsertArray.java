package ArrayListDemo;

import java.util.Scanner;

public class InsertArray {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		
		
		for(int i=0; i<size; i++)
		{
			
			array[i]=sc.nextInt();
//			System.out.println(array[i]);
		}
		
		System.out.print("Enter the array you want to insert: ");
		
		int newEle = sc.nextInt();
		
		System.out.print("Enter the position you want insert at: ");
		int position = sc.nextInt();
		
		int [] newArray = new int[array.length+1];
		
		for(int i=0; i<size+1; i++)
		{
			if(i<position)
			{
				newArray[i]=array[i];
			}else if(i==position)
			{
				newArray[i]=newEle;
				
			}else
			{
				newArray[i]=array[i-1];
//				i++;
			}
		}
		
		for(int i=0; i<newArray.length; i++)
		{
			System.out.println(newArray[i]);
		}
	}

}
