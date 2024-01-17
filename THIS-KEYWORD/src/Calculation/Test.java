package Calculation;

public class Test {
	
	int a;
	int b;
	
	Test(int x, int y)
	{
		this.a = x;
		this.b = y;
	}
	
	void display()
	{
		System.out.println("a: " +a+" "+"b: "+ b);
	}
	
	public static void main(String[] args) {
		
		Test t = new Test(10, 5);
		t.display();
		
		t.a=20;
		t.display();
		
		
		
	}
}
