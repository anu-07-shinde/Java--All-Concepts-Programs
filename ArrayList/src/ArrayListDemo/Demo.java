package ArrayListDemo;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		//Add Elements
		list.add(0);
		list.add(1);
		list.add(3);
		
		
		System.out.println(list);
		
		System.out.println();
		
		//Get Elements
		int num = list.get(2);
		
		System.out.println(num);
		
		System.out.println();
		
		//aa element between
		
		list.add(2, 6);
		System.out.println(list);
		
		System.out.println();
		
		
		//Delete Elements
		
		list.remove(3);
		System.out.println(list);
		
		//Size
		
		int size = list.size();
		System.out.println(size);
		
		//Loops
		
		for(int i=0; i<=list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//Sorting
		
//		Collection.(list);
		System.out.println(list);

	}

}
