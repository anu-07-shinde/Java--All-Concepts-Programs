package Collection.Set.HashSet;

import java.util.HashSet;

import java.util.Set;

public class AddHashSet {

	public static void main(String[] args) {
		
		
		Set<String> City = new HashSet<>();
		
		City.add("Kolhapur");
		City.add("Nipani");
		City.add("Pune");
		City.add("Mumbai");
		
		System.out.println(City);
		
		City.add("Delhi");
		
		System.out.println(City);
		
		System.out.println(City.size());
		System.out.println(City.isEmpty());
		
		
		City.remove("Pune");
		System.out.println(City);
	}

}
