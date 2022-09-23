
package CoreJava;

class Teacher1
{
	void teach()
  {
		System.out.println("maths");
  }  
}  

class Teacher2  extends Teacher1 
{ 
	void teach2()
  {
		System.out.println("Science");
  }  
}

class Teacher3 extends Teacher2{
 

	public static void main(String args[])
  {  

		Teacher3 A=new Teacher3();  
		
		
      A.teach1();
      A.teach2();
  }   
}
