package Collection;

import javax.swing.JOptionPane;

public class FindingMissing {
	
	int a;
	
	static {
		FindingMissing f=new FindingMissing();
		         f.a=10;
			}
	
	public static void main(String[] args) {
		String str="cbbaaajkkjanbvd";
		 
		JOptionPane.showConfirmDialog(null, "FUCK");
		
		
		/*
		 * for(char i:str.toCharArray()) { if(str.indexOf(i)==str.lastIndexOf(i)) {
		 * 
		 * continue;
		 * 
		 * } System.out.println(i); }
		 */
		
		
		for(int i=0;i<str.length();i++) {
			boolean b=false;;
			for(int j=0;j<str.length()-1;j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					b=true;
				}
				
			}
			if(b) {
				System.out.println("min occurring char :" +str.charAt(i));
			}
		}
	}
}