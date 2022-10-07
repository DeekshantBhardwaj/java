/*WAP to demonstrate while loop continues 
until entered number is positive.Take the input from the user
Author=Deekshant bhardwaj
Date=7/09/12


*/
import java.util.Scanner;
class Number

{
public static void main( String[] args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number :");
int number=sc.nextInt();

//using if-else loop to check weather the number is positive or not
if(number>0.0)//like we have take a input number is 11----> loop executed and print the number is positive
{
System.out.println("the number is positiv");
else
{
System.out.println("We are happy to see your progrsmmr is executed");
}
}
