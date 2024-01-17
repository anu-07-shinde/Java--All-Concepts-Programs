package Person_Info;

public class Person {
	
	String name;
	int age;
	
	Person(String sName, int sAge)
	{
		this.name = sName;
		this.age = sAge;
	}
	
	
	public String getName()
	{
		return name; 
	}
	
	
	public void setName(String sname)
	{
		this.name = sname;
	}
	
	public void printDetails()
	{
		System.out.println("Name is: " + this.name);
		System.out.println("Age is: "+ this.age);
	}
	
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Anu", 22);
		Person p2 = new Person("Aniket", 21);
		
		p1.printDetails();
		p2.printDetails();
		
		p1.setName("Anuradha");
		System.out.println("Name is Changed: "+p1.name);
		p1.printDetails();
		
	}

}
