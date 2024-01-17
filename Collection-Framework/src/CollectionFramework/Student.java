package CollectionFramework;

public class Student {
	

	static String name;
	static double marks;
	int rollno;
	
	public Student(String name, double marks, int rollno) {
		
		super();
		Student.name = name;
		this.marks = marks;
		this.rollno = rollno;
	}
	
	public static Student createStudent()
	{
		return null;
//		return new Student(name, marks, rollno);
	}

}
