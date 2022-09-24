abstract class Abstraction 
{
	//method of abstract class
public void Display()
{
	System.out.println("this is java programming");
}
}

public class TestAbstraction extends Abstraction 
{

    public static void main(String[] args)  {
// creating an object of subclass
TestAbstraction obj = new TestAbstraction();
//access methods of abstract class using object of subclass
obj.Display();	
}
}
