package sample;

public class College {
	private int roll;
	private String name;
	private String collegename;
	
	College() // default Constructor
	{
		System.out.println("***");
		
	}
	
	College(int roll, String name, String collegename) // Constructor with arguments
	{
		this.roll=roll;
		this.name=name;
		this.collegename=collegename;
		System.out.println("Name of the Student is "+getName() +" and his roll number is "+getRoll()+" and his College is "+getCollegename());
	}
	
	public String EndofProgram() //Non Static method
	{
		String s1 = "End of Program";
		return s1;
		
	}
	
	public static String BeginofProgram() //Static method belong to the class instead of specific instance
	{
		String s1 = "Start of Program";
		return s1;
		
	}
	
	public int getRoll() 
	{
		return roll;
	}
	public void setRoll(int roll) 
	{
		this.roll = roll;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getCollegename() 
	{
		return collegename;
	}
	public void setCollegename(String collegename)
	{
		this.collegename = collegename;
	}
	
}
