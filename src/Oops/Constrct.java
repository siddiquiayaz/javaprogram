package Oops;


class A13{
	/*
	 * A13(int x){ System.out.println("hii"); } A13(){
	 * 
	 * }
	 */
	int i=10;
	
	
}
public class Constrct extends A13 {
	/*
	 * public Constrct() {
	 * 
	 * System.out.println("bye"); }
	 */
	int i=20;
public static void main(String[] args) {
	A13 c=new Constrct();
	System.out.println(c.i);
}
}
