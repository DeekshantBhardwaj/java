/*    jaa programme top show that how the inherts works and its flows 
if you have see the programme 1 main class created and another are the sub classes of this.*//



class Animal //create a class 
{
  void eat()//method which name is eat
  {
    System.out.println("I am a omnivorous")
  }
}

class mammel extends Animal//now we can extends the class animal by amde a another child class which inherts a functions of superclass
{
    void  nature()
  {
    System.out.println("I am a Mammel")
   }
}
class Dog extends Mammal //child class extends with anothr child class
    {
        void sound()
        {
          System.out.println("I am Bark")
        }
    }
class main()//main class cretaed in which we have to call the objects and print them into the screen
{
  public static void main(String[] args)
  {
    Dog d = new Dog(); //creating a object of dog class to proceed the further programme
    d.eat();        //calling eat
    d.nature();   //calling nature
    d.sound();    //calling sound
  }
}
