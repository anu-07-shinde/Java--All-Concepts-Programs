package SmallestArray;

public class SmallestArray {
	public static void main(String[] args) {
		
			int[] array = {2,4,5,1, 6, 8, 2, 9};
			int min=array[0];
			
			System.out.print("The original Array: ");
			for(int i=0; i<array.length;i++)
			{
				System.out.print(array[i]+" ");
			}
			
			System.out.print("\nThe Smallest Array: ");
			for(int i=0; i<array.length;i++)
			{
				if(min>array[i])
				{
					min = array[i];
				}
			}
			
			System.out.print(min);
			
			}
		
		}
	


