package org.javatopics;

 class Student
{
	  public String studentName;
	   public int rollNumber;
	
	void setDetails(String name, int rollNo)
	{
		studentName = name;
		rollNumber = rollNo;
	}
	public static void main(String[] args) {
		
	}
}


public class AccessSpecifiersExample  
{

	public static void main(String[] args) 
	{
		Student s = new Student();
		s.studentName = "Deva";
		s.rollNumber = 10191;
		
		s.setDetails("MOnika",10100);
		
		
	}

}
