/*
Question1:WAP to Check for Leap Year.Take the input from the user
Author-Deekshant Bhardwaj
Date-6/09/2022



*/
import java.util.Scanner;//we can import the scanner classs to take input from the user
class Leapyear
  //making a classs with name Leapyear
{
  public static void main(String[] args)
  {
    //calling the scanner class and made its object
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the year :");   //The user given the input here to perform the further function
    int leapyear=sc.nextInt();
    //Now we can check weathear the user input is correct or not using the if and else loop we can checck condition
    
   
    if(leapyear % 4==0 || leapyear % 400==0)/* the condtion is like if the user given any value its must should be divided with 4 and also 400 
    {                                             like ex- 1600--> is divided by 4 and 400 both so it is a leap year the comdtion is true and loop executed 
    
                                            */ 
      System.out.println("yes it is a leap year");
      }
    else  //if the condition false the else loop will be executed
    {
      System.out.println("Not a leap year");
    }
  }
}
    
