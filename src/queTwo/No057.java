
package queTwo;
class Money{
 private String country = "Canada";
 public String getC(){return country;}
 }
 class Yen extends Money{
	 //country在父类中是私有的
// public String getC(){return super.country;}
 }
public class No057 extends Money {
	public String getC(){return super.getC();}
	public static void main(String[] args){
	 System.out.print(new Yen().getC() + " " + new No057().getC());
	 }
}
