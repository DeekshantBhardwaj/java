/*
Author= Deekshant Bhardwaj
Date=30/9/2022
programme-create a programme in which you can take 3 inputs from the user in which  2 is numereical value and one is operands if he 
enter 1- print the addition of the numbers
enter 2- print the subtraction of 2 numbers
enter 3- print the mutliplication of 2 numbers
enter 4- print the divide reslt of 2 numbers
*/
import java.util.Scanner;//calling the inbuilt package of java to take input value from the user

class calcuator{
	public static void main(String[] args)
	{    
		   Scanner sc=new Scanner(System.in);//create a scanner class
		   System.out.println("Enter the first number: ");//taking input from the user
		   int num1=sc.nextInt();
		   System.out.println("Enter the second number: ");  //taking second input from user
		   int num2=sc.nextInt();
		   System.out.println("Enter 1 for addition\n Enter 2 for substraction\n Enter 3 for multiplication\n Enter 4 for Divide\n");
		   int Press=sc.nextInt();
		 //using of nested if-else ledder to check the various inputs and case
		   if (Press==1)    //if the user press one the programme run the addition function
		  { 
         num1+=num2;
			  System.out.println("num1+num2=" + num1 );
		  }
		  else if(Press==2)//this operation also perform like above but they subtract the number from 1 from 2
		  { 
        num1-=num2;
			  System.out.println("num1-num2=" + num1 );
		  }
		  else if(Press==3)
		  { 
        num1*=num2;
			  System.out.println("num1*num2="+ num1);//calling the inbuilt package of java to take input value from the user
      }
		  else if(Press==4)
		  {  
        num1/=num2;
			  System.out.println("num1/num2="+ num1);
		  }
		  else
		  {
			  System.out.println("yOu type a wrong number press between 1 to 4 numbers only:");
		  }
    }
}
