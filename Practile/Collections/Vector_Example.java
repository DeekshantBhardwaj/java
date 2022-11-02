/*
 vector:-the Vector in Java is a class that implements 
 a dynamic array. This means we can increase or decrease the size of the array dynamically.
 */
package Collection;

import java.util.Vector;

class Vector_Ex {

	public static void main(String[] args) 
	{ Vector<String> ob= new Vector<String>();
	  //using the add method
	  ob.add("Aabc");
	  ob.add("bds");
	  //using index number
	  ob.add(2,"abc");
	  System.out.println("vector:"+ob);
	 //using addall method
	  Vector<String> a= new Vector<String>();
	  a.add("ee");
	  a.add("tt");
	 // System.out.println("new vector is:"+a);
	  //using remove method to remove element
	  String s=ob.remove(1);
	  System.out.println("removed element is :"+s);
	  System.out.println("new vector is:"+ ob);
	  //using clear method
	  ob.clear();
	  System.out.println("vector after:"+ob);

	}
}
