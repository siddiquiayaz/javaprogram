package Collection;

public class Object1 {
  Object1 show() {
	System.out.println("show");
	return this;

}
  void disp() {
	System.out.println("disp");
	
}
Object1 add() {
	System.out.println("add");
	return this;
	
}
public  Object1() {
	
	
}
public static void main(String[] args) {
	
	new Object1().show().add().disp();
	
	 
	
	
	
}
}
