package sample;
public class Exceptions {

	public static void main(String[] args) {
		try 
		{
		
			System.out.println("PROGRAM BEGINS");
			int i = 100;
			int s = i/0;
			int b[] = new int[2];	b[0] = 1;	b[1] = 1;
		}	
		catch(ArithmeticException e) // MULTIPLE CATCHES CAN BE THERE AFTER TRY BLOCK
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally  // Finally Block always executes after TRY BLOCK
		{
		System.out.println("PROGRAM END");
		}
	}

}
