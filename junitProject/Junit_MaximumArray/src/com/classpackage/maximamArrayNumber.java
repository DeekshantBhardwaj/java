/*Write A programme to find the maximum number  of the Array and using the junit
 * Author=Deekshant Bhardwaj
 * Date=23 Novrmber 2022 
 */

package com.classpackage;

public class maximamArrayNumber //pacakege which is created in manually not linking with maven package or anyother;
{
	
public int largest(int arr[]) //create a method ---largest---
	 {
		 int temp=arr[0];
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 if(arr[i]>temp)
				 temp=arr[i];
		 }
		 
		return temp ; ///return the array value 
	}

	 

}

