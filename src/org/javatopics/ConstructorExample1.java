package org.javatopics;


class Weather
{
	String season;
	int range;
	
	Weather() //default Constructor
	{
		season = "Rainy";
		range = 103;
	}
	
	Weather(String season, int range) //parameterized constructor
	{
		this.season= season;
		this.range = range;
	}
	
	void display()
	{
		System.out.println(season + " - " + range);
	}
}

public class ConstructorExample1 
{

	public static void main(String[] args) 
	{
		Weather w = new Weather();
		w.display();
		
		Weather we = new Weather("Summer", 108);
		we.display();
		
		Weather u = new Weather("Winter", 106);
		u.display();
	}

}
