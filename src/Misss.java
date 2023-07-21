import com.javaprogram.Ayaz;

public class Misss extends Ayaz {
	static transient Ayaz ayaz;

	void ayaz1() {
		System.out.println("hello");
	}

	public static void main(String[] args) {

		
		  
		  
		  int ar[]= {1,2,4,8};
		  
		  int r[]=new int [ar.length];
		  
		  for (int i:ar) { r[i]=1;
		  
		  }
		  
		  for (int i = 1; i < r.length; i++) {
		  
		  if(r[i]==0) 
			  System.out.println(i);
		  
		  }
		 
	}

}