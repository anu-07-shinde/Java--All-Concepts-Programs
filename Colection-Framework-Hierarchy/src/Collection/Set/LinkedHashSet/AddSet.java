package Collection.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class AddSet {

	public static void main(String[] args) {
		
		Set<String> Languages = new LinkedHashSet<>();
		

		
		Languages.add("Java");
		Languages.add("PHP");
		Languages.add("C");
		Languages.add("CPP");
		Languages.add("Python");
		
		
		
		System.out.println(Languages);
		
		Languages.add("Ruby");
		
		System.out.println(Languages);
		
		System.out.println(Languages.size());
		System.out.println(Languages.isEmpty());
		
	}

}
