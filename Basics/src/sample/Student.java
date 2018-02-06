package sample;

public class Student {
	
	public static void main(String[] args)
	{
	System.out.println(College.BeginofProgram()); // calling static method
		
	College C1 = new College(); // College() is default constructor
	College C2 = new College(); // C2 is an object or instance of a class "College"
	College C3 = new College(710770,"Simbu","STC");
	
	C1.setName("John");	C1.setRoll(710772);
	C2.setName("STAR"); C2.setRoll(710771);
	
	System.out.println("Name of the Student is "+C1.getName() +" and his roll number is "+C1.getRoll()+" and his College is "+C1.getCollegename());
	System.out.println("Name of the Student is "+C2.getName() +" and his roll number is "+C2.getRoll()+" and his College is "+C2.getCollegename());
	System.out.println();
	
	System.out.println(C3.EndofProgram()); // calling Non static method
	}
	

}
