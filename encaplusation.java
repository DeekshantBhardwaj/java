public class EncaplusationExample
	{
	  //first we can create a 3 private classes in which we can define the student name s.nameand age
	  private String name;//name
	  private String sname;//surname
	  private int age;//age=22
	 //now we can use of getters and setters to elaborate a class or strings we define;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	  

}

  
  class runExample extends EncaplusationExample
  {
    public static void main(String[] args)
    {
      EncaplusationExample obj  = new EncapluationExample();
      obj.setName("Deekshant");
      obj.setSname("Bhbardwaj");
      obj.setAge(22);
      System.out.println("Name:" +obj.getName());
      System.out.println("sname:" +obj.getSname());
      System.out.println("age:" +obj.age());
    
  }
  }
 
