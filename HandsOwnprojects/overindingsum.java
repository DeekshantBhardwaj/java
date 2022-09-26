class Sum//creating a class
{ //passing the parameters
  public int sum(int x,int y)//givem the value in intergers
  {
    return(x+y);//sum of x+y
  }
  public int sum(int x,int y,int z) //paassing the parameter and having the output 
  {
    return(x+y+z)//sum of x+Y+z
    }
  public double sum(double x,double y)//passing the parameter in double now
  {
    return(x+y)
    }
 
    public static void main(String[] args)
    {
     sum s= new sum();//now create the object caaling the object from other child classes
      System.out.println(s.sum(20,30));
      System.out.println(s.sum(20,30,40));
      System.out.println(s.sum(12.3,12.3));
    }
}
