package sample;

public class Interface1 implements Interface
{
public int bank() // Implementing the method of Interface class
{
	return 10;
}
public static void main(String[] args)
{
	Interface I = new Interface1();
	System.out.println(I.bank());
}

}
