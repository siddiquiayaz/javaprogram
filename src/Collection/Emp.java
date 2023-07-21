package Collection;

public final class Emp {
	String name;
	int id;
	public Emp( int id,String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	@Override
	public int hashCode() {
		return id;
	}
	
	 public String toString() {
		 return id+" "+name;
	 }
	 

	 public boolean equals(Object obj) {
	        if (obj instanceof Emp) {
	           Emp em=(Emp)obj;
	           if (this.id==em.id) {
	        	   return true;
				
			}
	        }
	        return false;
	        
	    }
	 
	 
	
}

