package VehicleProject;

public class Main {

	public static void main(String[] args) {
		
		Bycycle b= new Bycycle();
		b.ChangeGear(2);
		b.SpeedUp(2);
		b.SpeedBreak(1);
		
		System.out.println("This function of bycycle");
		b.PrintState();
		
		
		Bike bi = new Bike();
		bi.ChangeGear(4);
		bi.SpeedUp(3);
		bi.SpeedBreak(2);
		
		System.out.println("This function of Bike");
		bi.PrintState();
		

	}

}
