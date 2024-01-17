package ATM_Machine;

import java.util.Scanner;

public class ATM {
	
	
	int pin = 0513;
	float Balance;
	
	public void CheckPIN()
	{
		System.out.print("Enter a pin: ");
		
		Scanner sc = new Scanner(System.in);
		
		int EnterPIN = sc.nextInt();
		
		if(EnterPIN == pin)
		{
			System.out.println("PIN is correct.......");
			menu();
		}
		else
		{
			System.out.println("correct PIN........");
		}
		
		System.out.println();
	}
	

	

		public void menu()
		{
//			int opt = 0;
			
			
			System.out.println("Enetr your choice: ");
			System.out.println();
			System.out.println("1. Check Account Balance");
			System.out.println("2. Check Withdraw Money");
			System.out.println("3. Deposite Money");
			System.out.println("4. EXIT");
			
			Scanner sc = new Scanner(System.in);
			
			int opt = sc.nextInt();
			
			System.out.println();
			
			if(opt == 1)
			{
				CheckBalance();
				
			}else if(opt == 2)
			{
				WithdrawMoney();
				
			}else if(opt == 3)
			{
				DepositeMoney();
				
			}else if(opt == 4)
			{
				return;
				
			}else
			{
				System.out.println("Enter valid choice: ");
			}
			
		
		}
			
			public void CheckBalance() {
					
					System.out.println("Balanace: " + Balance);
					System.out.println();
					menu();
				}
				


			public void WithdrawMoney() {
					
					System.out.print("Enter amount to withdraw: ");
					Scanner sc  = new Scanner(System.in);
					float amount = sc.nextFloat();
					
				if(amount > Balance)
					{
						System.out.println("Unsufficient balance....");
						System.out.println();
						
					}
				else
					{
						amount = amount -  Balance;
						System.out.println("Withdraw successfully..........");
						System.out.println();
					}
					menu();
			}
				
				

				public void DepositeMoney() {
					
					
					System.out.print("Enter amount to deposite: ");
					Scanner sc = new Scanner(System.in);
					float amount = sc.nextFloat();
					Balance = Balance + amount;
					System.out.println();
					System.out.println("Deposite money successfully....\n");
					System.out.println();
					menu();
				}
				
			}
		

