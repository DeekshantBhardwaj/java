/*
 stack:
 */
package Collection;

import java.util.Stack;

class Stack_Ex {

	public static void main(String[] args)
	{  Stack<Integer> ob= new Stack<Integer>();
	    ob.push(3);
	    ob.push(5);
	    ob.push(7);
	    System.out.println("the stack is :"+ ob);
	    ob.pop();
	    System.out.println("stack after pop:"+ob);
		
	}

}
