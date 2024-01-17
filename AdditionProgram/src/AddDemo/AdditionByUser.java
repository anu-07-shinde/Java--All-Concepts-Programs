package AddDemo;
import java.util.Scanner;

public class AdditionByUser {
	
	int x, y, z;
	public void add() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		x = sc.nextInt();
		y = sc.nextInt();
		
		z = x + y;
		
		System.out.println(z);
	}
	
	

	public static void main(String[] args) {
		
		AdditionByUser a = new AdditionByUser();
		a.add();
		
	}
	
	

}
