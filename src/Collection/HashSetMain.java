package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetMain {
   public static void main(String[] args) {
	
	      HashSet<Emp> h=new HashSet<Emp>();
	       Emp e=new Emp(100,"ayaz" );
	       Emp e1=new Emp(100,"khan" );
	       Emp e2=new Emp(10,"kfa" );
	           
	            
	       h.add(e);
	       h.add(e1);
	       h.add(e2);
	       
	       System.out.println(h);
	       Iterator i=h.iterator();
	       while (i.hasNext()) {
	    	    System.out.println(i.next());
			
		}
	    
}
}
