package sample;

public final class Finaldemo // Final class cannot be Subclassed
	{	
	final int ant;
	
	Finaldemo() // ------------ Assigning the value of Final variable a using default Constructor
	{
		ant = 10;
		System.out.println("Thanks - the value is assigned to ant variable");
	}
	
	public final void antmethod() // Final method cannot be overridden by Subclasses
	{
		System.out.println("Value of Final type variable ant is "+ant);
	}
	
	public static void main(String[] args)
	{
		Finaldemo fn = new Finaldemo();
		fn.antmethod();
		// fn.ant = 11; ---------- Final variable value can be assigned only once 
	}
}

