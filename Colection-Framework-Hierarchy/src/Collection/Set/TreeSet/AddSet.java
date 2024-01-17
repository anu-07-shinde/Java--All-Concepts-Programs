package Collection.Set.TreeSet;

import java.util.TreeSet;
import java.util.Set;

public class AddSet {

	public static void main(String[] args) {
		

		Set<Integer> Number1 = new TreeSet<>();
		
		Number1.add(100);
		Number1.add(101);
		Number1.add(106);
		Number1.add(103);
		Number1.add(108);
		Number1.add(105);
		
		
		System.out.println(Number1);
		
		System.out.println(Number1.size());
		System.out.println(Number1.isEmpty());
		
		
	}

}
