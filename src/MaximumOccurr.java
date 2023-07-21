import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class MaximumOccurr {

	
	
	public static void main(String[] args) {
		  
		  String str=" siddiqui ayaz ";
		  
		  str = Arrays.stream(str.split(" ")).collect(Collectors.joining());
		  	
		  
		  Map<Character, Integer> map = new HashMap<Character,Integer>();
		  
	
		  
		  for (char c : str.toCharArray()) {

			    if (map.containsKey(c)) {
			      int counter = map.get(c);
			      map.put(c, ++counter);
			    } else {
			      map.put(c, 1);
			    }
			  }
		  
		  for(Character character : map.keySet()) {
			if(map.get(character) > 1) {
				  System.out.println( character + " charecter : " + map.get(character));
			}
		  
		  }
		  
		
		
			}

}
