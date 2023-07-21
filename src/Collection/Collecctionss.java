package Collection;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.*;

public class Collecctionss {
  
	public static void main(String[] args) {
		
		ArrayList<Integer> iList = new ArrayList<>();
	
	//Binary Search in List Collection
		int index = Collections.binarySearch(iList, 190);
		System.out.println("Binary Search index is : "+index);
		System.out.println("Binary Search of 190 index is : "+index);


	

	//Copy one list to another list
	//It does not create new list
	//It copies the values into the new list indexs
	ArrayList<Integer> newList = new ArrayList<>();
	newList.add(11);
	newList.add(12);
	newList.add(13);
	newList.add(14);
	newList.add(15);
	Collections.copy(newList, iList); //newList should have the same size as src list
	System.out.println("Copied List : "+newList);

	//newList should have minimum size as iList
	Collections.copy(newList, iList); 
	System.out.println("Copying the list from another list : "+newList);

	//Creating Immutable Collection
	Set<String> emptySet = Collections.emptySet();
	List<String> emptyList = Collections.emptyList();
	Map<String, String> emptyMap = Collections.emptyMap();
	System.out.println("Creating immutable collection (list, set, map)");
	System.out.println("Empty Set : "+emptySet.size());
	//emptySet.add("Try");  //not allowed its immutable

	//replacing all the elements with the new value
	Collections.replaceAll(iList, 10, 100);
	System.out.println("Replacing all the 10 in the list with 100 :");
	System.out.println(iList);

	//shuffling the list
	Collections.shuffle(iList);
	System.out.println("Shuffle the Elements in the List : ");
	System.out.println(iList);

	//Creating singleton Collection Set, List, Map
	Set<String> singletonSet = Collections.singleton("Java");
	System.out.println("Creating singleton Collection : ");
	System.out.println(singletonSet);
//	singletonSet.add("Hello"); //not supported its immutable

	//Creating synchronized Collection List, Set, Map
	Map<Integer, String> map = new HashMap<>();
	map = Collections.synchronizedMap(map);


	System.out.println("Creating synchronizing Collection : ");
}

}

