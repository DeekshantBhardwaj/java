/*  Ques3:Create a program for calculation.read three values from the user for operation
first and second values as operands.
third value as operator.
if user press1 => print addition of first and second
if user press2 => print subtraction of first and second
if user press3 => print multiplication of first and second
if user press4 => print division of first and second    */

import utils.Scanner
class Calculation()
{
  public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
    
    System.out.println("Enter the first Number: ")
      int a= sc.nextInt();
    System.out.println("Enter the Second number: ")
      int b=sc.nextInt();
    int add,sub,divide,mul,mod:
    
    
    System.out.println("press1"+  a+b)
     System.out.println("press1"+ a*b)
      System.out.println("press1"+  a/b)
     System.out.println("press1"+ a-b)
    }
}
