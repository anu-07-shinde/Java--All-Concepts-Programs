package ReturnTypes;

public class Return1 {
	
	
	public int IntVal()
	{
		int y = 100;
		return y;
	}
	
	public double DoubleVal()
	{
		double y = 10.5;
		return y;
		
	}
	
	public String StringVar() 
	{
		String y = "Hello My name is Anu";
		return y;
	}
	
	public static void main(String[] args) {
		
		int y = 200;
		Return1 RT = new Return1();
		
		RT.IntVal();
		
	}
}
