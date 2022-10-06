/*write a programme to reverse pyramid
Author-Deekshant Bhardwaj
Date-6/09/2022
*/
import java.util.Scanner;

class ReversePyramid {

	public static void main(String[] args) {
		//creating scanner object to take input from user
		Scanner sc =new Scanner(System.in);
		 //getting input value from user
		System.out.println("enter the value for how much big you want your pattern:");
		int size=sc.nextInt();
		//we can use of for loop to execte this programme and after this we have seen a reverse pattren 
		for (int i= 0; i<= size-1; i++)
			/* this loop having the 3 conditions are there so you can taken value from the user like "5"
			2.next inilizaton was there about(5-1)
		                                         (then i value should be 4 now(4-1) this conditons folllows again and again and print 
			*/
	    {
	      for (int j=0; j<=i; j++)/*loop another 
	      				loop will execute but this loop 
	      				is using for only for spacing
	      				this will be executed like 1.******
								   2. ****(this follows the first
									    taken "i" value 
									    then come to "j" for 
								             spacing)
*/
{
	        System.out.print(" ");
	      }
	    
	      for (int k=0; k<=size-1-i; k++)
	      {
	        System.out.print("*" + " ");
	      }
	      
	      System.out.println();
	    }
	}
}
