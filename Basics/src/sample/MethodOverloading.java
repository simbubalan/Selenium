package sample;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		System.out.println(Add(1,2));
		System.out.println(Add(1.000000001f,1.20000000002f));
		System.out.println(Add("ST","AR"));
	}
					
		public static int Add(int a,int b) // Method overloading - Method name is same and argument differs
		{
			return(a+b);
		}
		public static float Add(float a,float b)
		{
			return(a+b);
		}
		public static String Add(String a,String b)
		{
			return(a+b);
		}
	}

