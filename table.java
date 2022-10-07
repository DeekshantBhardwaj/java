import java.util.Scanner;
class Table
{  
    public static void main(String args[])   
    {  
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter number: ");       
    //reading a number whose table is to be print  
    int num=sc.nextInt();  
    //loop start execution form and execute until the condition i<=10 becomes false  or when the value of i=10
    for(int i=1; i <= 10; i++)  
    {  
    //prints table of the entered number      
    System.out.println(number+" x "+i+" = "+number*i);  
    }  
    }  
    }  
