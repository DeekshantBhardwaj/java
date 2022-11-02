/* Collection:-The Collection in Java is a framework
that provides an architecture to store and manipulate the group of objects.
package Collection;
Arraylist:- the arraylist implements list interface and it uses a dynamic array to store the 
duplicate elements of different  data types.
*/
package Collection;

import java.util.*;
class Array_List {

	public static void main(String[] args) 
	{ 
		ArrayList<Integer> ob=new ArrayList<Integer>();//creating arraylist
		//adding object in arraylist
		ob.add(4);
		ob.add(2);
		ob.add(5);
		//System.out.println(ob);
		Iterator a=ob.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
	}

}
