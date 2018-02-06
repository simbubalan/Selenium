package sample;

public class Poly {

	public static void main(String[] args) 
	{
		PolyBankmain B0 = new PolyBank0(); // Polymorphism -  parent class reference is used to refer to a child class object
		PolyBankmain B1 = new PolyBank1();
		PolyBankmain B2 = new PolyBank2();
		
		System.out.println(B0.getinterest());
		System.out.println(B1.getinterest());
		System.out.println(B2.getinterest());
	}

}

// Polymorphism is the ability of an object to take on many forms. 