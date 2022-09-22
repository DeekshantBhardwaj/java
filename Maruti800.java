package Corejava;

class Maruti800 extends Maruti{
	//Default contructor of Maruti800 class

	   public Maruti800()
	   {
		System.out.println("Maruti Model: 800");
	}
	   public void speed()
	   {
		System.out.println("Max: 80Kmph");
	   }
	   public static void main(String args[])
	   {
		 Maruti800 obj=new Maruti800();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
	   }
	}
