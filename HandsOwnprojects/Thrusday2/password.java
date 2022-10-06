/* WAP to check the condition for checking the correct password using If-Else.Take input from the user.
Author-Deekshant Bhardwaj
Date-6/09/2022
*/
import java.util.Scanner;
class PasswordCheck
  //class name with Passwordcheck
{
  public ststicvoid main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the username: ");
      String username= sc.nextLine();        //we can take a string input from the user  to denote the value
    System.out.println("Enter the password :");
     int password =sc.nextInt();
    if (username=="" || password==12345)     //In this certain area we can implement the if else loop with or operator to check the two condition sequence
    {
      System.out.println("welcome home");
      }
    else
    {
    System.out.println("Authcation fail");
    }
