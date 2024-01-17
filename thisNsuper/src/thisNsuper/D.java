package thisNsuper;

public class D extends A{
	
	int a = 40;
	
	public void m1()
	{
		int a = 50;
		System.out.println("This is JavaByKiran class.....");
		System.out.println(a);
		System.out.println("This: " + this.a);
		System.out.println("Super: " + super.a);
		
		B b = new B();
		b.b1();
//		System.out.println(b.a);
		
		C c = new C();
		c.c1();
//		System.out.println(c.a);
	}
	
	public static void main(String[] args) {
		
		D d = new D();
		d.m1();
		
		
	}

}
