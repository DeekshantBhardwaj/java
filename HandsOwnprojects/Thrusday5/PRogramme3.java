/*
Write a java program to replace the second element of a ArrayList with the specified element
Author=Deekshant Bhardwaj
Date=03 November 2022
*/
import java.util.ArrayList;
//Create a class Array_list class
public class Array_List {
   public static void main(String[] args) {
      ArrayList<String> ls = new ArrayList<String>();
      ls.add("Deekshant");        
      ls.add("Prakashpuri");
      ls.add("TigerWood");//replace the element with thegrambell
      ls.add("HAppysingh");
      System.out.println(ls);
     //Now list the elements replace twith this elements...........
      list.set(2, "Grambell");
      System.out.println(ls);
   }
  /*
  Output-
  ls 1-->[Deekshant, Prakashpuri, TigerWood, HAppysingh]
                                    ^^
                                    ||
                                this replace this....    
  ls 2-->[Deekshant, Prakashpuri, Grambell, HAppysingh]
  
  
  */
}
