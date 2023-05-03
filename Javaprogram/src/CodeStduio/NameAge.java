package CodeStduio;

import java.util.Scanner;
public class NameAge {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.print("The name of the person is "+ name );
		System.out.print(" and the age is "+age);
	}
}
