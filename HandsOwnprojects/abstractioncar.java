//Create a programme on abstract class in which they can shown above property of abstract class
Abstract class car
{
  void car()//method is created
  {
    System.out.println("car is built")//print the output of car class
    }
}
Abstract class drive//abstract keyword 
{
  void gearchange()
  {
    System.out.println("Gear change")
    }
}
public class tesla extends car
{
  void drive()
  {
   System.out.drive("Safe driving")
   }
  public static void main(Sttring[] args)
  {
  tesls T= new tesla();//object calling
  T.gearchange();
  T.drive();
  }
}
