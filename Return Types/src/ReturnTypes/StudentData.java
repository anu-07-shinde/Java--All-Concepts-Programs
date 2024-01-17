package ReturnTypes;

public class StudentData {
	
	String name;
	int Rollno;
//	String Address;
	
	public String S_name(String Uname)
	{
		name = Uname;
		return name;
	}
	
	public int S_RollNo(int URollno)
	{
		Rollno = URollno;
		return Rollno;
	}
	
	public void show()
	{
		StudentData sd = new StudentData();
		System.out.println(sd.S_name("Anu"));
		System.out.println(sd.S_RollNo(101));
		System.out.println ("**************************************************************");
		
	}
	
	public static void main(String[] args) {
		
		StudentData sd = new StudentData();
		sd.show();
		
	}

}
