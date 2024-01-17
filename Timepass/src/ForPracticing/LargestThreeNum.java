package ForPracticing;

public class LargestThreeNum {
	
	public static void main(String[] args) {
		
		
		int num1=200, num2=350, num3=250;
		
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" is largest number");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2+" is largest number");
		}else
		{
			System.out.println(num3+" is largest number");
		}
	}

}
