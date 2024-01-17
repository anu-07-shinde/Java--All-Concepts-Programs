package AbtractClassInterface;


abstract class Account1 implements Bank
{
	public void deposite()
	{
		System.out.println("Deposite: "+50);
	}
}

abstract class Account2 extends Account1
{
	public void withdraw()
	{
		System.out.println("Withdraw: "+20);
	}
}

class Account3 extends Account2
{

	@Override
	public void loan() {
		
		
	}

	@Override
	public void account() {
		
		
	}
	
}
public class AbstractClassInterface {
	
	public static void main(String[] args) {
		
		Account2 a = new Account3();
		a.deposite();
		a.withdraw();
		
	}

}
