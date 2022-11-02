/*
 It is a type of queue wherein all the elements are ordered as per their ordering  
 and each element is associated with a priority 
 */
package Collection;

import java.util.*;

class Priority_Queue {

	public static void main(String[] args)
	{ PriorityQueue<Integer> num= new PriorityQueue<>();
		num.add(1);
		num.add(7);
		num.add(6);
		System.out.println("priorityQueue:" + num);
		//using iterator() method
		//hasNext():boolean(True/False) 1:true, 7:true,6:true,false
		//next():works with iterator 
        //Iterator<Integer> ite=num.iterator();
        while(!num.isEmpty())
        {
        	System.out.println(num.remove());//dequeue
        }
     }
}
