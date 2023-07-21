package com.javaprogram;



interface Remote{
	 void channel();
	 void volume();
	 void color();
 }
   
   class IndiaTv implements Remote{

	@Override
	public void channel() {
		System.out.println("thid india tv");
		
	}

	@Override
	public void volume() {
		System.out.println("change the volume");
		
	}

	@Override
	public void color() {
		System.out.println("change the color");
		
	}
	   
	   
   }
   class SamsungTv implements Remote{

	@Override
	public void channel() {
		
		System.out.println("samsung tv ");
		
	}

	@Override
	public void volume() {
		System.out.println("samsung tv volume change ");
		
	}

	@Override
	public void color() {
		System.out.println("color change samsang tv");
	}
	   
   }


public class StaticNestedC {
	public static void main(String[] args)throws InstantiationException,Exception
	{
		 
			
		
		Class c=Class.forName("");
	
	
		Remote r=(Remote)c.newInstance();
		r.volume();
		r.color();
		r.channel();
		
	}
	
}


