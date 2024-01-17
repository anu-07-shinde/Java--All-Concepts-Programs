package Overloading;

public class Arithmetic {
	
	public void sum(int a)
	{
		System.out.println(a + a);
	}
	
	public void sum(double a)
	{
		System.out.println(a + a);
	}
	
	public void sum(double a, double b)
	{
		System.out.println(a + b);
	}
	
	public void sum(String a, int b)
	{
		System.out.println(a + b);
	}
}
