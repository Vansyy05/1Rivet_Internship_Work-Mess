package Javap;

class Definingclass{  
	 //defining fields  
	 int id;//field or data member or instance variable  
	 String name;  
	 //creating main method inside the Student class  
	 
	 public static void main(String args[]){  
	  //Creating an object or instance  
	  Definingclass s1=new Definingclass();//creating an object of Student  
	  //Printing values of the object
	  s1.id=50;
	  s1.name="Java";
	  System.out.println(s1.id);//accessing member through reference variable  
	  System.out.println(s1.name);  
	 }  
	}
