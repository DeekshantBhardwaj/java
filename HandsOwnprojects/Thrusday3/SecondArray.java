/*
Write a programme to find the second largest array element
Author=Deekshant Bhardwaj
Date=20/09/22

*/

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter size of array");
		 int size=sc.nextInt();
		 System.out.println("Enter elements of array");
		 //Declaring array
		 int[] arr=new int[size];
		 //Traversing array
		  for(int i=0;i<size;i++)
			{
			  arr[i]=sc.nextInt();
	        }
		  Arrays.sort(arr);
		  System.out.println(Arrays.toString(arr));
		  System.out.println("Second larget array is "+arr[(arr.length-2)]);
	   
	}
}
