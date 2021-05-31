package javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOperations {
	
	public static void main(String[] args) {
		//Add items
		List<String> list = new ArrayList<String>();
		list.add("first");
		list.add("second");
		
		Iterator itr = list.iterator();
		//printing list using iterator
		while(itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print("|");
		}
		
		//use of set and get methods set is used to set an element at a given position.
		list.set(1, "third");
		System.out.println(list.get(1));
		
		ArrayList<Students> li = new ArrayList<Students>();
		  Students s1=new Students(101,"Sonoo","bijnor");  
		  Students s2=new Students(102,"Ravi","nagina");  
		  Students s3=new Students(103,"Hanumat","jhalu");  
		  li.add(s1);
		  li.add(s2);
		  li.add(s3);
		  
		  Iterator sit = li.iterator();
		  
		  while(sit.hasNext()) {
			  
			  Students s = (Students) sit.next();
			  
			  System.out.println(s.add+" "+ s.id+" "+ s.name);
			  
		  }
		  
	}

	
	
	
	
	

}
