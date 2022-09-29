/*
Author:Deekshant Bhardwaj
Date:29 sept 2022
*/




//Creating a programme to find largest of two numbers...........
import java.util.Scanner;//this is use because the inbuilt feature in jasa to take output from the user
class Sum //create a main class
{
  public static void main(String[] args)
   {
     Scanner sc= new Scanner(System.in);//creating caaling class object here
    
    System.out.println("enter first number");//enter the first input
		int num1 = sc.nextInt();
    
    
    System.out.println("enter second number")//Second input from the user
    int num2 = sc.nextInt();
    
    if(number1<number2)//conditional loop is implement where you can see that opoerator is used 
		{
			System.out.println(num1+ "number 1 is larger");
		}
		else//condition false than this loop will applied
		{
			System.out.println(num2+ "number 2 is larger");

		}
		
	}
