package Collection;

import java.util.LinkedList;
import java.util.Queue;

class Queue_Ex {

	public static void main(String[] args) {
		Queue<Integer> ob= new LinkedList<Integer>();
		// add()-insert the element into the queue
		//offer()-insert the element into the queue
		ob.add(5);
		ob.offer(5);
		ob.add(8);
		System.out.println("queue:"+ob);
		//element()-returns the head element of the queue and throw exception if the queue 
		 //is empty.
		//peek()-returns the head element of the queue and returns null if the queue is empty.
		//create an variabale of int datatype
		int a=ob.peek();
		System.out.println("access element:"+a);
		//remove()-remove the head of the queue and throw exception if the queue is empty.
		//poll()-remove the head of the queue and returns if the queue is empty .
		int b=ob.poll();
		System.out.println("removed element:"+b);
		System.out.println("updated queue:"+ob);
	}

}
