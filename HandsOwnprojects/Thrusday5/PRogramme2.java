/*
Write a java program to check if a particular element exist in a Linked List
Author=Deekshant Bhardwaj
Date=03 November 2022
*/
import java.util.LinkedList;
 
public class CheckElementLinkedListExample {
 
  public static void main(String[] args) {
 
    //create LinkedList object
    LinkedList ls = new LinkedList();
   
    //add elements to LinkedList
    ls.add("1");
    ls.add("2");
    ls.add("3");
    ls.add("4");
    ls.add("5");
   
    /*
     * To check if a particular element exists in a LinkedList, use
     * boolean contains(Object obj) method.
     *
     * This method returns true if LinkedList contains a particular element,
     * false otherwise.
     */
    
     boolean booleanElement = ls.contains("4");
    
     if(booleanElement)
     {
       System.out.println("List contains 4");
     }
     else
     {
       System.out.println("List does not contain 4");
     }
  }
}
