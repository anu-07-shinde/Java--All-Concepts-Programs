package ThisnSuperCall;

public class D extends A{
	

	int a =50;
	
	void m1()
	{
		
		System.out.println("Methods calling..........");
		
		
	}
	
	public static void main(String[] args) {
		
		D d = new D();
		System.out.println(d.a);
		d.m1();
		C c = new C();
		System.out.println(c.a);
	
		
		
		
	}
}
