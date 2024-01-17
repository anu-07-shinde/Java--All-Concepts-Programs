package main;
import makestudent.MakeStudent;

import student.Student;


public class Main {
	
	public static void main(String args[])
	{
		Student ss = MakeStudent.createStudent();
		System.out.println(ss.getName());
		System.out.println(ss.getmarks());
		System.out.println(ss.getrollNo());
		
	}

}
