import java.util.Scanner;

class MaxMinArrayElement {

	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the size of array ");
	      int n= sc.nextInt();
	      System.out.println("Enter the elements ");
	      //declaring the array
	      int a[]= new int [n];
	      //Traversing the array
	      for(int i=0; i<n;i++)
	      { a[i]=sc.nextInt();}
	      int max=a[0];int min =a[0];
	      //Traversing the array
	      for(int j=0;j<n;j++)
	      {  if (a[j]>max)
	    	  {max= a[j];}
	    	  else 
	    	  { min=a[j];}
	      }
	System.out.println("Maximum value of the array " + max);
	System.out.println("Minimum value of the array " + min);
	}
}
