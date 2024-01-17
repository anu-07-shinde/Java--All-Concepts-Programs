package GreaterNumber;

public class Test {
	
	
	int x,  y; 
	
	public void check(int x, int y)
	{
		
		this.x = x;
		this.y = y;
		
		if(x > y)
		{
			System.out.println("x is greater than y");
		}
		else
		{
			System.out.println("x is smaller than y");
		}
	}

	public static void main(String[] args) {
		
		Test t = new Test();
//		t.check(10, 5);
		t.check(20, 40);
		
	}
}
