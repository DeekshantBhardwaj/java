
/*
 * Implementation of Binary search tree.
 * A sorted collection.
 * Stores unique elements.
 */
package Collection;

import java.util.*;

public class Tree_Set {

	public static void main(String[] args)
	{TreeSet<String> ts=new TreeSet<>();
	ts.add("Ravi");
	ts.add("Vijay");
	ts.add("Ravi");
	ts.add("Ajay");
	//Traversing elements
	System.out.println("Elements in Order:");
	Iterator<String> itr=ts.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println();
	System.out.println("Elements in Descending Order:");
	//To print in descending order
	Iterator<String> itr1=ts.descendingIterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
}

}
		
