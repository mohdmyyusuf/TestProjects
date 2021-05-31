package SP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionOne {
	
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(16);
		list.add(17);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	Comparator cmp = Collections.reverseOrder();
	Collections.sort(list, cmp);
	Iterator ite = list.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	//Remove duplicates from ArrayList
	
	 List<String> al = new ArrayList<String>();  
     al.add("Mango");  
     al.add("Banana");  
     al.add("Mango");  
     al.add("Apple");  
    // System.out.println(l.toString());  
     Set<String> s = new LinkedHashSet<String>(al);  
     Set<String> s1 = new HashSet<String>(al); 
     System.out.println(s); 
     
     //Maps
     
     Map<Integer, String> map = new HashMap<Integer, String>();
     map.put(1, "I");
     map.put(1, "Love");
     map.put(1, "Java");
     map.put(1, "But");
     map.put(1, "ML");
     
     List<Integer> lst = new ArrayList<Integer>(map.keySet());
     List<String> lst1 = new ArrayList<String>(map.values());
     
     System.out.println(lst+"Values: " + lst1);
     
     HashSet hs  = new HashSet();
     hs.add("I");
     hs.add("Love");
     hs.add("Java");
     hs.add("But");
     hs.add("ML");
     
     Object [] ob = hs.toArray();
     
     for (int i = 0; i < ob.length; i++) {
		System.out.println(ob[i]);
	}
     
	//convert an object array to an integer array 
     
     Object []obArr = {10, 2, 30, 40,50}; 
     
     int a[] = new int[obArr.length];
     for (int i = 0; i < a.length; i++) {
		a[i] = (int) obArr[i];
		System.out.println(a[i]);
	}
     
     //convert an Array to a Set in Java
     
     Integer[] myArray = {23, 93, 56, 92,92, 39};
     Set<Integer> set = new HashSet<Integer>();
     Collections.addAll(set, myArray);
     System.out.println(set);
     
     
	}
	

}
