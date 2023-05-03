package com.springconstructor;

public class Student {
		private int sid;
		private String sname,saddress;
		
		public Student(int sid, String sname, String saddress) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.saddress = saddress;
		}

		@Override
		public String toString() {
			return this.sid+" : "+this.sname+" : "+this.saddress+"";
		}
		
		
		
		
}
