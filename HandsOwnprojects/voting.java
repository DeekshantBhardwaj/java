/* person is eligibal for voting or not
@Author=Deekshant Bhardwaj
@date-3/08/2022
*/
import java.util.Scanner;
class Voter//create a class anme voter
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);//noe taking the input from the user so amke a scanner function
  System.out.println("Enter the number");

  int voter =sc.nextInt();//tsking voter as variable to store the value which is given by the user
  if(voter>18)//using of if-else loop now we can check the condition of th programm
  {
    //if the age above 18 then the loop will execute
    System.out.println("you are eligibal for voting");
    }
  else
  {
    //or else the age is less than 18 than the else loop execute and programme is ended
    System.out.println("you are not eligibal for voting");
    }
  }
}
