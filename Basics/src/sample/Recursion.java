package sample;

public class Recursion {

	public static int factorial(int f)
	{
		if (f<=1)
			return 1;
		else
			return (f*factorial(f-1)); // Recursion - Calling the method within the method
	}
	public static void main(String[] args) 
	{
		System.out.println(factorial(5));
	}

}
