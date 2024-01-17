package HashMap;

import java.util.HashMap;

public class Demo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> stud = new HashMap<>();
		
		stud.put(101, "Anu");
		stud.put(102, "Komal");
		stud.put(105, "Nikita");
		stud.put(103, "Aniket");
		stud.put(104, "Kj");
		
		
		System.out.println(stud);
		
		System.out.println(stud.get(105));
//		System.out.println(stud.get("Nikita"));
		
		
		for(int i: stud.keySet())
		{
			System.out.println(i);
		}
		System.out.println("=====================");
		for(String i:stud.values())
		{
			System.out.println(i);
		}
	
		
	}

}
