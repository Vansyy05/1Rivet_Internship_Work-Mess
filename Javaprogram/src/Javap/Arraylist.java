package Javap;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("Java");
		list.add("Array");
		list.add("List");
		list.add("Linked");
		
		Collections.sort(list);
		
		
//		Using Getter and Setter:
//		System.out.println("returning element: "+list.get(1));
//		System.out.println("changing element: "+ list.set(1,"Linkedlist"));
		
		
		//Using for-each:
		for(String str:list) {
			System.out.println(str);
		}
		
		
//		Using Iterator:
//		Iterator itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
//		Simple method:
//		System.out.println(list);

	}

}
