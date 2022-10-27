/*
Write a progamme to print an array in asscending order
Author=Deekshant Bhardwaj
Date=27/10/22

*/
class Assendind
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Size");
    int n= sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements:");
     for( int i=0;i<n;i++)
        {  arr[i]=sc.nextInt();}
        
        Arrays.sort(arr);
        System.out.println("sortedd array is ");
      
        for( int i:arr)
        {System.out.print(i+" ");}
	}
}
