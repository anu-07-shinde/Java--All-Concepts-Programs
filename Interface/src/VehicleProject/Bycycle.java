package VehicleProject;

public class Bycycle implements Vehicle{
	
	int gear;
	int speed;
	
	public void ChangeGear(int newGear) {

		gear = newGear;
		
	}
	@Override
	public void SpeedUp(int increment) {

		speed = speed + increment;
		
	}
	@Override
	public void SpeedBreak(int decrement) {
		
		speed = speed - decrement;
		
	}
	
	public void PrintState()
	{
		System.out.println("Gear: " + gear + "\n" + "Speed: " + speed);
	}
	
	

}
