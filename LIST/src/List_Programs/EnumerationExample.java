
package List_Programs;

import java.util.*;

public class EnumerationExample {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add(101);
		v.add("Aniket");
		v.add("Adavkar");
		
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		
		
	}

}
