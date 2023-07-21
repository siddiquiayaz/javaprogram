package Collection;



class Finger{
	
	void finger() {
		   
		System.out.println("finger ");
	}
}
class Heart{
	public Heart() {
		new Finger().finger();
		
		System.out.println("heart..");
	}
	
}
class Hand{
	void hand() {
		System.out.println("hand");
	}
	
}
class Brain{
	
	public Brain() {
	    
		
		  System.out.println("Brain");
	}
	
}

public class Human {
	 void show(Human a) {
		 System.out.println("ayaz");
	 }
	 void show(String s) {
		 System.out.println("ayaz");
	 }
	 
	 
	
	
	public Human() {
		Heart heart= new Heart();

		Hand hand= new Hand();
		Brain brain= new Brain();
		Finger finger= new Finger();
	}
	public static void main(String[] args) {
		Human o=new Human();
		
		
		
		
	}

}
