
public class Dog {

	private String breed;
	private String colour;
   private double weight;
   private double height;
   public Dog(String breed,String colour,double weight,double height){
	   this.breed=breed;
	   this.colour=colour;
	   this.weight=weight;
	   this.height=height;
   }
   public void makingSound(){
	   System.out.println("Bow Bow");
   }
}
