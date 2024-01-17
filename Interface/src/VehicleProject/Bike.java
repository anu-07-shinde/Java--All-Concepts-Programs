package VehicleProject;

public class Bike {

	int gear;
	int speed;
	
	public void ChangeGear(int newGear) {

		gear = newGear;
		
	}
	
	public void SpeedUp(int increment) {

		speed = speed + increment;
		
	}
	public void SpeedBreak(int decrement) {
		
		speed = speed - decrement;
		
	}
	
	public void PrintState()
	{
		System.out.println("Gear: " + gear + "\n" + "Speed: " + speed);
	}
	
}
