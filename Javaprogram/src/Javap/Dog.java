package Javap;

class A{
	 void eat() {System.out.println("eating");}
}

class B extends A{
	 void bark() {System.out.println("barking");}
}
 class Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B d=new B();
		d.bark();
		d.eat();
	}

}
