package sample;

import java.util.*;

public class ListIteratorTest {
	
	public static void main(String[] args)
	{
		LinkedList<String> LL = new LinkedList<String>();
		LL.add("STR"); LL.add("VTV"); LL.add("AYM");
		
		ListIterator<String> LI = LL.listIterator();  // LIST ITERATOR - NEXT(), PREVIOUS();
		
		//to check whether list has elements
		System.out.println(LI.hasNext()+"\n"); // BOOLEAN RETURN TYPE  HASNEXT(), HASPREVIOUS();
		
		// Normal order
		while (LI.hasNext())
		System.out.println(LI.next());
		System.out.println();
		
		// Reverse order
		while (LI.hasPrevious())
		System.out.println(LI.previous());
	}

}
