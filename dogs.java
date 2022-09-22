package Corejava;

//Use of Extends keyboard to perform Inheritance
class Dog extends Animal
{//Methods and Fields of Animal
//Methods and Fields of Dog

public void display(){
System.out.println("My Name is :"+ name);
}
public static void main(String[] args){
//Creating an object of Child or Subclass

Dog d= new Dog();
//Access Fields of super class
d.name="bulldog";
d.display();
//call Method of super class Using object of sub class
d.eat();
}
}
