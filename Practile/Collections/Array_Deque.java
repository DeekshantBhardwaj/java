/*
 it is a way to apply resizable-array in addition
 to the implementation of the dequeue interface. 
 */
package Collection;

import java.util.*;

class Array_Dequeue {
    public static void main(String[] args) 
    { Deque<String> ob=new ArrayDeque<>();
      ob.add("mango");
      ob.add("banana");
      ob.add("apple");
      System.out.println("elements");
      for(String s:ob)
      {
    	  System.out.println(s);
      }
      //ob.pollLast()
      ob.pollLast();
      System.out.println("After pollLast():");
      for(String s:ob)
      {
    	  System.out.println(s);
      }
    }
}
