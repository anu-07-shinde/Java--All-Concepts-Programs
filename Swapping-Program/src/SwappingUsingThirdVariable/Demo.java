package SwappingUsingThirdVariable;

public class Demo {

	int x = 10;
	int y = 20;
	int temp;
	
	
	public void swap()
	{
		System.out.println("Displayy values before swapping...."+ "\n " + x + "\n " + y);
		
	    temp = x;
	     x = y;
	     y = temp;
	    
	    System.out.println("Display values after swapping....." + " \n " + x + "\n " +y );
		
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.swap();
		
	}
}
