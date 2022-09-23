    //Java Program to illustrate the use of Java Method Overriding  
    //Creating a parent class.  
    class girlfrirend
    {  
      //defining a method  
      void relation()
      { 
        System.out.println("girlfriend is chilling");
      }  
    }  
    //Creating a child class  
    class boyfriend extends girlfriend
    {  
      //defining the same method as in the parent class  
      void relation()
      {
      System.out.println("boyfriend is chilling");
      }  
      
      public static void main(String args[]){  
      boyfriend obj = new boyfriend();//creating object  
      obj.relation();//calling method  
      }  
    }  
