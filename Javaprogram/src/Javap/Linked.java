package Javap;

import java.util.*;
public class Linked{
	public static void main(String args[]) {
		LinkedList<String> al=new LinkedList<String>();
		al.add("Jasjkk");
		al.add("nfkdsnf");
		al.add("fklsdngklsn");
		al.add("dnajdafm");
		Iterator <String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}


