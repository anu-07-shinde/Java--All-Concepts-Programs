package BUBBLESORT;

public class BubbleSort {
	
	public static void print(int a[])
	{
		int n = a.length;
		int i;
		
		for(i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	
	public static void sortEle(int a[])
	{

        int n = a.length;  
        int i, j, temp;  
        for (i = 0; i < n; i++)  
        {  
            for (j = i + 1; j < n; j++)  
            {  
                if (a[j] < a[i])  
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
               
                }
                
            }  
            
		}
		
       
	}
	
	
	public static void main(String[] args) {
		int a[] = {4, 2, 6, 9, 1};
		BubbleSort b = new BubbleSort();
		
		
		System.out.println("Original Array: ");
		b.print(a);
		
		b.sortEle(a);
		System.out.println();
		
		System.out.println("After Bubble Sorting: ");
		b.print(a);
	
		
	}
	

}
