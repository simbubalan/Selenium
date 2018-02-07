package sample;
import java.util.*;
public class Lists {

	public static void main(String[] args) 
	{
		//HASHSET----------------  DOES NOT MAINTAIN THE ORDER THE ELEMENTS ARE ADDED ------------------------------
		//LINKEDHASHSET----------------  MAINTAINS THE ORDER THE ELEMENTS ARE ADDED ------------------------------
		//TREESET----------------  MAINTAINS THE NATURAL SORTING ORDER FOR THE ELEMENTS (ex ASC to DSC, 1,2,3)--------------
		HashSet<String> HS = new HashSet<String>(); // No duplicates allowed
		HS.add("ABI");HS.add("CHRISTY");HS.add("PAVI");HS.add("JULIET");
		System.out.println("Result for HASHSET");
		Iterator<String> IT = HS.iterator();
		while (IT.hasNext())
		{System.out.println(IT.next());}
		System.out.println("\n");		
		
		//LINKEDLIST------------------------------------------------------------------------------------------------
		LinkedList<Integer> LL = new LinkedList<Integer>(); // Linked list with Integer data type
		LL.add(1);LL.add(10);LL.add(100);LL.add(1000);
		System.out.println("Result for LINKEDLIST");
		Iterator<Integer> ITS = LL.iterator();
		while (ITS.hasNext())
		{System.out.println(ITS.next());}
		System.out.println("\n");
		
		
		//ARRRAYLIST------------------------------------------------------------------------------------------------
		ArrayList<Integer> AL = new ArrayList<Integer>(); // Array list with Integer data type
		AL.add(10);	AL.add(25);	AL.add(35);	AL.set(2,100); // modifies the given Array list index with the value provided
		// AL.clear(); Array list size becomes zero
		// AL.remove(index); 
		System.out.println("Result for ARRAYLIST Integer type size is - "+ AL.size());
		for (Integer i : AL) //Advanced For Loop // Integer is a non-primitive data type
		{System.out.println(i);}
		
		ArrayList<String> ST = new ArrayList<String>(); // Array list with String data type
		ST.add("SATHYA BALAN");	ST.add("ARUN BALAN"); ST.add("PON BALAN");
		System.out.println("\n"+"Result for ARRAYLIST String type size is - "+ ST.size());
		for (String i : ST) 
		{
			System.out.println(i);
		}
						
	}

}
