package Collection.List.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class AddRemoveAllOperation {

	public static void main(String[] args) {
		
		List<Integer> Num1 = new ArrayList<>();
		
		Num1.add(21);
		Num1.add(32);
		Num1.add(16);
		Num1.add(9);
		Num1.add(40);
		
		System.out.println(Num1 + "\n");
		
		
		List<Integer> Num3 = new ArrayList<>(Num1);
		System.out.println("Num3: " + Num3);
		
		List<Integer> Num2 = new ArrayList<>();
		
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
