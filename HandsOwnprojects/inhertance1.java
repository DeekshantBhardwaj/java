class Animal
{
  void eat()
  {
    System.out.println("I am a omnivorous")
  }
}

class mammel extends Animal
{
    void  nature()
  {
    System.out.println("I am a Mammel")
   }
}
class Dog extends Mammal 
    {
        void sound()
        {
          System.out.println("I am Bark")
        }
    }
class main()
{
  public static void main(String[] args)
  {
    Dog d = new Dog();
    d.eat();
    d.nature();
    d.sound();
  }
}
