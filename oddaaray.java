//write a programe to calculate the sum of all odd numbers

import java.util.Scanner;

public class ArrayOdd {

	public static void main(String[] args) {
		//Creating object of Class Scanner to take input from user 
	    Scanner sc =new Scanner(System.in);
	    //declaring an array
	    int arr[]=new int[10];
	    System.out.println("Enter the numbers");
	    //taking input from the user
	    for(int i=0;i<5;i++) {
	    	arr[i]=sc.nextInt();
	    	
	    }
	    int sum=0;
	    //traversing the array
	    for(int i=0;i<5;i++) {
	    	if(arr[i]%2!=0) {
	    		sum+=arr[i];
	    	}
	    }
	    System.out.println("Sum of all odd numbers is "+sum);
	    
	    
		
	}

}
