package ReturnType;

public class Calculations {
	
	public int add(int x, int y)
	{
		int z = x + y;
		return z;
	}
	
	
	public static void main(String[] args) {
		
		Calculations c = new Calculations();
		@SuppressWarnings("unused")
		int add = c.add(10, 20);
	}

}
