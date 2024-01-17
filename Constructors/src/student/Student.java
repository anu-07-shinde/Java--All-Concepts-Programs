package student;
//import makestudent.MakeStudent;

public class Student {

	String name;
	Double marks; 
	int rollNo;
	
	public Student(String uname, double umarks, int urollNo)
	{
		name = uname;
		marks = umarks;
		rollNo = urollNo;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getmarks()
	{
		return marks;
	}
	
	public int getrollNo()
	{
		return rollNo;
	}
	
	
}
