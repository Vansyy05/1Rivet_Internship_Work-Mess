package CodeStduio;

import java.util.* ;

public class Statements{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && b>c && c>a) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println("Largest among all.");
		}
	}
	
}