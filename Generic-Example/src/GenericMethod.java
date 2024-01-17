
public class GenericMethod {
	
	public static<E> void printArray(E[] element)
	{
		for(E elements : element)
		{
			System.out.println(elements);
		}
		
		System.out.println();
	}
	
	
	public static void main(String[] args)
	{
		Integer[] intArray = {1,2,3,4,5,6,7,8,9};
		Character[] charArray = { 'a','b','c','d','e','f'};
		
		
		System.out.println("Integer Array: ");
		
		printArray(intArray);
		
		System.out.println("Character Array: ");
		printArray(charArray);
	}

}
