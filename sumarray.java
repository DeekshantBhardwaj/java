import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the Size:");
	    int a= sc.nextInt();
	    int arr[]= new int[a];
	    System.out.println("Enter the Elements:");
	    for(int i=0;i<a;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int sum=0;
	    for(int i=0;i<a;i++)
	    {
	        sum= sum+arr[i];
	    }
	    System.out.println("the sum is " +sum);
		
	}
}
