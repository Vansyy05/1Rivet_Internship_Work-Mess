package com.onerivet.designpattern;


public class IteratorPattern {
		public static void main(String[] args) {
			
			NameRepository namesrepo=new NameRepository(); 
			for(Iterator itr=namesrepo.getIterator();itr.hasNext();) {
				String name=(String)itr.next();
				System.out.println("Course: "+ name);
			}
		}
}
