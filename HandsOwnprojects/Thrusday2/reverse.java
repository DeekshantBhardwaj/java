/* Write a programme to reverse a number
Author- Deekshant Bhardwaj
Date-6/09/2022
*/
import java.util.Scanner;
class ReverseNumber //making a class by reverse number
{
  public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
   System.out.println("Enter the Number :"); //talking the iput from the user
    int number = sc.nextInt();
    int revnum = 0;  //create a variable which can store your reverse number value
  /* **********************Logic behind the programme is***************************
  1. First we use while loop to execute the condition taking the number from the user which is not equal to 0
  2.Now number is there after first condition we can check another condition and we can divide by 10
  3.now we have a number and a variable called reverse in which we can store a our reverse value so add the remainder to the number and number divided by 10
  */
  
    while(number != 0)   
    {  
    int remainder = number % 10;  
    revnum = revnum * 10 + remainder;  
    number = number/10;  
    }  
    System.out.println("The reverse of the given number is: " + revnum);  
    }  
    }  
  
