/*
Write a programme to print a Array in descending order by taking user unput
Author= Deekshant Bhardwaj
Date=27/10/2022
*/
import java.util.*;
class Desecding
{
  Public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the string:");
    String n=sc.nextLine();
    String arr[]=new String[n];
   System.out.println("Enter the characters");
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextLine();
      Array.sort(n,reverseOrder());
      System.out.println(ArraystoString(n));
      
    }
  }
}
