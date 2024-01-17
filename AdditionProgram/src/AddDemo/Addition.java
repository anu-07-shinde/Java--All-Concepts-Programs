package AddDemo;

public class Addition {

	
	public int add(int a, int b)
	{
		
		return a + b;
	}
	public static void main(String[] args) {
		
		Addition a = new Addition();
		int c = a.add(10, 20);
		System.out.println(c);
		
	}
}
