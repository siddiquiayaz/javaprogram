package Collection;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@SuppressWarnings("unchecked")
public class ConcurrentHashmap1 {

	
	public static void main(String[] args) {
		
		
		Map map=new HashMap();
		map.put(100, "ayaz");
		  
		map.put(101, "aasif");
		map.put(102, "siddqui");
		map.put(103, "khan");
	     Set s=map.entrySet();
	     Iterator i =s.iterator();
	     while (i.hasNext()){
	    	 Entry e=(Entry)i.next();
	    	 
	    	 System.out.println(e);
	    	 
	     }
	     
			    
			
		
		
	
	}
	}
