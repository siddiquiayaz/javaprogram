
public class CustomMethod {
        public boolean CustomEqualsMeth(CustomMethod c)
        {
        	return (this==c);
        }
       void show() {
    	   System.out.println(this);
       }
           Integer integer=10;
    		
			 @Override
			public String  toString() {
			     return "ayaz";
			}
		   
	   
	public static void main(String[] args) {
		CustomMethod b=new CustomMethod();
		CustomMethod n=new CustomMethod();
           System.out.println(b.CustomEqualsMeth(n));
		
	System.out.println(b==n);
	   
    	

	
}
}