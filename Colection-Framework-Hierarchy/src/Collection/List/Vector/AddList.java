package Collection.List.Vector;

import java.util.ArrayList;
import java.util.List;

public class AddList {

	public static void main(String[] args) {

		List<String> Languages = new ArrayList<>();
		

		
		Languages.add("Java");
		Languages.add("PHP");
		Languages.add("C");
		Languages.add("CPP");
		Languages.add("Python");
		
		
		
		System.out.println(Languages);
		
		Languages.add(2, "Ruby");
		
		System.out.println(Languages);
		
		System.out.println(Languages.size());
		System.out.println(Languages.isEmpty());
		
		

	}

}
