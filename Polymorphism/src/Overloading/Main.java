package Overloading;

public class Main {
	
	public static void main(String[] args) {
		
		Arithmetic ar = new Arithmetic();
		ar.sum(10);
		ar.sum(10.2, 20.3);
		ar.sum(10.10);
		ar.sum("RollNo: ", 10);
		
	}

}
