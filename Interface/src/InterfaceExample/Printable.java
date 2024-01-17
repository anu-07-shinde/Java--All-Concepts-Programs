package InterfaceExample;

public interface Printable {
	
	void print();
}

class AAA implements Printable
{
	public void print()
	{
		System.out.println("Hello Anu..........");
	}

	
	public static void main(String[] args) {
		
		AAA a = new AAA();
		a.print();
		
	}
}
