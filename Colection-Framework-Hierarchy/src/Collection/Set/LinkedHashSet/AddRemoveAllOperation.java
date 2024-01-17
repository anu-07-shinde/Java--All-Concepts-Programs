package Collection.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class AddRemoveAllOperation {

	public static void main(String[] args) {
		
		Set<Integer> Num1 = new LinkedHashSet<>();
		
		Num1.add(21);
		Num1.add(32);
		Num1.add(16);
		Num1.add(9);
		Num1.add(40);
		
		System.out.println(Num1 + "\n");
		
		
		Set<Integer> Num2 = new LinkedHashSet<>();
		
		Num2.add(12);
		Num2.add(23);
		Num2.add(61);
		Num2.add(90);
		Num2.add(8);
		
		System.out.println(Num2 + "\n");
		
		
		
		Num1.add(81);
		System.out.println(Num1 + "\n");
		
		
		Num1.addAll(Num2);
		System.out.println(Num1 + "\n");
		
		
		Num1.remove(3);
		System.out.println(Num1 + "\n");
		
		
		Num1.remove(Num2);
		System.out.println(Num1 + "\n");
		
		
		
		Num1.removeAll(Num2);
		System.out.println(Num1);
		
		Num1.removeAll(Num1);
		System.out.println(Num1);

		
	}

}
