package HashSet;

import java.util.HashSet;

public class Demo {
	
	public static void main(String[] args) {
		
		
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set);
		
		System.out.println(set.contains(5));
		
		System.out.println(set.contains(2));
		
		System.out.println(set.remove(2));
		
		for(int i : set)
		{
			System.out.println(i);
		}
		
	}

}
