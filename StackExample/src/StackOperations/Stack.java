package StackOperations;
import java.util.Scanner;

public class Stack {
	
	int top;
	int maxSize = 5;
	int arr[] = new int[maxSize];
	
	
	boolean isEmpty()
	{
		return(top < 0);
	}
	
	
	Stack()
	{
		top = -1;
	}
	
	boolean push(Scanner sc)
	{
		if(top == maxSize - 1)
		{
			System.out.println("Stack is Overflow");
			return false;
		}
	
		else
		{
			System.out.print("Enter the value: ");
			int val = sc.nextInt();
			top++;
			arr[top]=val;
			System.out.println("Item pushed");
			return true;
		}
	}
	
	boolean pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is undeflow");
			return false;
		}
		else
		{
			top--;
			System.out.println("Item popped");
			return true;
		}
	}
	
	
	void display() 
	{
		System.out.println("Printing stack elements.....");
		for(int i=top; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	}

}
