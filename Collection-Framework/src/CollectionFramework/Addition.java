package CollectionFramework;

public class Addition {
	
	
	public static void add(Integer x, Integer y)
	{
		System.out.println(x + y);
	}

	
	public static void main(String[] args) {

		add(new Integer(10), new Integer(20));
		
		add(Integer.valueOf(150), Integer.valueOf(20));

	}

}
