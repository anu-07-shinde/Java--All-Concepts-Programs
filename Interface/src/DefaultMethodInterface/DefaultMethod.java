package DefaultMethodInterface;


class Implemented implements Interface1, Interface2
{

	@Override
	public void print() {
		{
			System.out.println("It is Interface1");
		}
		
	}

	@Override
	public void show() {
		
		System.out.println("It is Interface2");
		
	}
	
}

public class DefaultMethod {
	
	public static void main(String[] args) {
		
		
		Implemented i = new Implemented();
		i.defaultShow();
		i.show();
		i.print();
	}

}
