package Oops;

class Parent{
	
	int a=30;
	void  disp() {
		System.out.println("hey");
		
	}
	
}
class Child extends Parent{
	int b=20;
	void disp() {
		System.out.println("hello");
		
	}
	
}


public class GrandChild extends Child {
	
	  void show(Parent p) {
		  p.disp();
		
		  System.out.println(((Parent)(this)).a);
		  System.out.println(((Child)(this)).b);
		 
	  }
    public static void main(String[] args) {
		GrandChild g=new GrandChild();
		g.show(g);
	
		
		
		
	}
}
