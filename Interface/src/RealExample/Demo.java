package RealExample;

class Bicycle implements Vehicle
{
	int speed;
	int gear;
	@Override
	public void gearChange(int gear) {
		
		this.gear=gear;
		
		
	}

	@Override
	public void speedUp(int increment) {

		speed = speed + increment;
		
	}

	@Override
	public void breakDown(int decrement) {
		
		speed = speed - decrement;

		
	}
	
	void print()
	{
		System.out.println("Speed: "+speed+"   "+"Gear:"+gear);
		System.out.println();
	}
}
	
	class Motorcycle implements Vehicle
	{
		int speed;
		int gear;
		@Override
		public void gearChange(int gear) {

			this.gear = gear;
			
		}

		@Override
		public void speedUp(int increment) {
			
			speed = speed + increment;
			
		}

		@Override
		public void breakDown(int decrement) {
			
			speed = speed - decrement;
			
		}
		
		void print()
		{
			System.out.println("Speed: "+speed+"   "+"gear:"+gear);
		}
		
	}
	


public class Demo {
	
	public static void main(String[] args) {
		
		
		System.out.println("For Bicycle: ");
		Bicycle b = new Bicycle();
		b.gearChange(2);
		b.speedUp(3);
		b.breakDown(1);
		
		b.print();
		
		System.out.println();
		
		System.out.println("For MotorCycle: ");
		
		Motorcycle m = new Motorcycle();
		m.gearChange(2);
		m.speedUp(5);
		m.breakDown(2);
		
		m.print();
		
		
		
	}

}
