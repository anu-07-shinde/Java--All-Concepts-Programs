package Collection.Set.TreeSet;

import java.util.TreeSet;
import java.util.Set;

public class AddRemoveAllOperation {

	public static void main(String[] args) {
		

		Set<Integer> Number1 = new TreeSet<>();
		
		Number1.add(100);
		Number1.add(101);
		Number1.add(102);
		Number1.add(103);
		Number1.add(104);
		Number1.add(105);
		
		System.out.println("Add Operation: 1st List ");
		
		System.out.println(Number1);
		
		
		Set<Integer> Number2 = new TreeSet<>();
		
		Number2.add(1001);
		Number2.add(10);
		Number2.add(121);
		Number2.add(1031);
		Number2.add(41);
		Number2.add(105);
		
		
		
		System.out.println("Add Operation: 2nd List");
		
		System.out.println(Number2);
		
		System.out.println();
		
		
		//AddAll number1 in Number2 List
		
		Number1.addAll(Number2);
		
		System.out.println("AddAll Operation: ");
		
		System.out.println(Number1);
		
		
		//AddAll list at particular Index
		
		System.out.println();
		
		Number1.addAll(Number2);
		
		System.out.println("AddAll Operation at particular index: ");
		
		System.out.println(Number1);
		
		
		//Remove by index

		System.out.println();
		
		Number1.remove(5);
		
		System.out.println("Remove Operation: ");
		
		System.out.println(Number1);
		
		
		//Remove Number2 list from Number1
		
		System.out.println();
		
		Number1.removeAll(Number2);
		
		System.out.println(Number1);
		
		
		//Remove Number1 List
		
		Number1.removeAll(Number1);
		
		System.out.println(Number1);
		
		
		
		
		
	}

}
