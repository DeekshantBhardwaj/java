/*
 the elements are stored by using hashing 
contains unique element. allow null value.
order is in ascending.
 */
package Collection;

import java.util.*;

class Hash_Set {

	public static void main(String[] args)
	{
		HashSet<String> name= new HashSet<>();
		name.add("Aditya");
		name.add("ramesh");
		name.add("riya");
		name.add("Aditya");
		//traversing elements(iterator)
		Iterator<String> itr=name.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
