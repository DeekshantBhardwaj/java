/*
 *linked list implements the collection interface and it also stores duplicate data 
 */
package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Linked_list {

	public static void main(String[] args)
	{ 
		LinkedList<Integer> ob=new LinkedList<Integer>();//creating linkedlist
		//adding object in linkedlist
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
