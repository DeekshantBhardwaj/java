/* write a programme use if and elde loop if a person ahving percentage above 60 he /she is pass or he fails
@Author=Deekshant Bhardwaj
@date=3/08/22
*/
//import the java util class beacuse user can give input and we can use the java package
import java.util.Scanner;
class Subject//creating a class with name "Subject"
{
  public static void main(String[]args)
  {
    //now we can import or use the scanner from java utils to take input from the user
    Scanner sc=new Scanner(System.in);
    //takling 5 inputs from the user as a subject marks like using "SUB1,Sub2......etc"
    //you can take input as a string as name of the subjecto call or using it outside the class also
    System.out.println("Enter the first subject number");
      int Sub1=sc.nextInt();
     System.out.println("Enter the Second subject number");
      int Sub2=sc.nextInt();
     System.out.println("Enter the Third subject number");
      int Sub3=sc.nextInt();
     System.out.println("Enter the fourth subject number");
      int Sub4=sc.nextInt();
     System.out.println("Enter the fifth subject number");
      int Sub5=sc.nextInt();
    /*now we have use the main logic of the programme in which we have average of 5 subject
              ***********Average Formula*************
              (sum of all number) *100 /total number of subjects
    */
    int subject=(Sub1+Sub2+Sub3+Sub4+Sub5)*100/500;
                 //Using the loop given condition says you are pass or fail                     
    if(subject>60)
    {
      System.out.println("Hurray you are pass");//if condition true "you are pass"
    }
    else
    {
      System.out.println("\tbetter luck for next time\t");//or if condition false then else executed the else loop" try next time"
    }
    
  }
}
