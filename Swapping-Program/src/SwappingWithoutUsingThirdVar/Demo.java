package SwappingWithoutUsingThirdVar;

public class Demo {
	
	int x = 10;
	int y = 20;
	
	
	public void swap()
	{
		System.out.println("Before swapping....." + x + " " + y);
		
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After swapping...." + x + " " + y);
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.swap();
		
	}
}
