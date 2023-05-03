package com.lambaexpressiondemo;
//without lambda expression


/*interface draw {
	public void draw();
}
public class Demo1 {
	public static void main(String[] args) {
		int a=10;
		draw d=new draw() {
			
			@Override
			public void draw() {
				System.out.println("Drawing "+a);
				
			}
			
		};
		d.draw();
	}
}*/


//with lambda expression
@FunctionalInterface
	interface draw{
		public void draw();
	}

public class Demo1{
	public static void main(String[] args) {
		int a=15;
		draw d=()->{
			System.out.println("Drawing"+a);
		};
		d.draw();
	}
}