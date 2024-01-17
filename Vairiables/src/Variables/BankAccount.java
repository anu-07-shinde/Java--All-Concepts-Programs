package Variables;

public class BankAccount {
	
	int Account = 10;
    static String BankName = "SBI";

	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		System.out.println(ba.Account);
		System.out.println(BankAccount.BankName);

	}

}
