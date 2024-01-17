package Calculation;

public class Test2 {
	B obj;
	
	Test2(B obj)
	{
		this.obj = obj;
		
	 obj.display();
	}


}

class B
{
	int x=20;
	
	B()
	{
		Test2 t2 = new Test2(this);
		
	}
	
	void display()
	{
		System.out.println("The value of x: " + x);
	}
	

}

class Main
{
	public static void main(String[] args) {
		
		B b = new B();
		b.display();
	}
}
