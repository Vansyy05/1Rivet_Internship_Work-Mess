package com.onerivet.designpattern;

public class NameRepository implements Container{
		 String name[]= {"C","C++","Java","Python","Javascript"};

		@Override
		public Iterator getIterator() {
			return new NameIterator();
		}
		
		private class NameIterator implements Iterator {
			int index=0;
			
		@Override
		public boolean hasNext() {
			if(index < name.length) {
			return true;
			}
			return false;
			}
		

		@Override
		public Object next() {
			if(this.hasNext()) {
				return name[index++];
			}
			return null;
		}
		
}
}