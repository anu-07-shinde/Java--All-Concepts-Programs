package ArrEvenOdd;


public class ArrayEvenOddPos {

	public static void main(String[] args) {
		
		
		int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
		
		System.out.println("************* Even Numbers **********");
		
		for (int i = 0; i < array.length; i++) {
			
			
			if(array[i] % 2 == 0)
			{	
				System.out.print("Index " + i + " -> ");
				System.out.println(array[i]);
			}
			
		}
		
		System.out.println("***********Odd Numbers***************");
		
		for (int i = 0; i < array.length; i++) {
		
			if(array[i] % 2 != 0)
			{	
				System.out.print("Index " + i + " -> ");
				System.out.println(array[i]);
			}
		}
		
		
		
	}

}


