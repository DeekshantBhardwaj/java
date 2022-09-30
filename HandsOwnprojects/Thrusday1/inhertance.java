/*
Author:Deekshant Bhardwaj
Date:29 sept 2022
*/



class parent
  //making a class name parent
{
  void sing()//method making
  {
    System.out.println("i am singing");
    }
}
class child extends parent()//extends the class with super class
{
  void speak()//another method
  {
    System.out.println("i am speak");
    }
  void dance()//method
  {
    System.out.println("i am dancing");
    }
  class main()//main class with calling all the objects
  {
    public static void main(String[] args)
    {
     
      //creating a object or calling the above method
      child d=new child();
    d.sing();//calling the above method
    d.speak();//calling the above method
    d.dance();//calling the above method
  }
}               
