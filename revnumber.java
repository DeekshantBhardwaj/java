
/* Write a programme to reverse a number
Author- Deekshant Bhardwaj
Date-6/09/2022
*/
import java.util.Scanner;

// Program to find the sum of natural numbers from 1 to 100.

class reversenumber {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     
      System.out.println("Enter the value of n :");
      int n=sc.nextInt();
       System.out.println("Enter the value of i :");
      int i=sc.nextInt();
    do {
      System.out.println(i);
      i--;
    } while(i >= n);
  }
}
