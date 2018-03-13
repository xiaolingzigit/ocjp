package queTwo;
class Plant{
 private String name;
 public Plant(String name){this.name = name;}
 public Plant(){this("fern");}
// public Plant(){Plant("fern");}
// public Plant(){Tree();}
 public String getName(){return name;}
 }

public class No043 extends Plant{
	
	public void growFruit(){}
	 public void dropLeaves(){}
}
