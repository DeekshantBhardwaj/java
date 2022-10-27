/*
Write a progarame to print happy diwali by talking user input
Author= Deekshant Bhardwaj
Date=27/10/22

*/

import java.util.Scanner;

class ArrayReverse {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	    System.out.println("enter a string");
	   String arr=sc.nextLine();
    //talking a user input 
	   char a[]=arr.toCharArray();
    //implement a method in which we can change a string into character
	   System.out.println("reverse of a string is ");
         int i=a.length;
    //taking a length what given in programme
         for(int j=i;j>0;j--)
         {
           //printing reverse a what user is given
        	 System.out.print(a[j-1]);
           //only they print the user input same as given
           System.out.print(a[j]);
         }
	}     
}
