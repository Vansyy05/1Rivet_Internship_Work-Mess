package CodeStduio;
import java.util.Scanner;

public class Coordinator {
	public static void main(String args[]) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		 x=sc.nextInt();
		 System.out.println("Enter y");
		 y=sc.nextInt();
		if(x==0 && y==0) {
			System.out.println("Origin");
		}else if(x>0 && y>0) {
			System.out.println("1st quadrant");
		}else if(x<0 && y>0) {
			System.out.println("2nd quadrant");
		}else if(x<0 && y<0) {
			System.out.println("3rd quadrant");
		}else if(x>0 && y<0) {
			System.out.println("4nd quadrant");
		}else if (x>0 || x<0 && y==0) {
			System.out.println("x-axis");
		}else
			System.out.println("y-axis");
			
		}
	}

