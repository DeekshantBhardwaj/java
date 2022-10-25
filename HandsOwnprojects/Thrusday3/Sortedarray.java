/*
Author=Deekshant bhardwaj
Write a programe to print a sorted array
date= 20/09/2022

*/
import java.util.*;
class Array
{
  public static void main(String[] args)
  {
    Scanner sc= new Scannner(System.in);
    System.out.println("Enter the size ");
    int n= sc.nextInt();
    int[] arr= new int[n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt()
            Arrays.sort(arr);
        System.out.println("sortedd array is ");
      
        for( int i:arr)
        {
          System.out.print(i+" ");
        }
	}
}
    
