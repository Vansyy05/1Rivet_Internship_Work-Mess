package Javap;
import java.util.Scanner;
public class PercentageCal {

	public static void main(String[] args) {
		System.out.println("Enter marks of the student");
		Scanner marks=new Scanner(System.in); 
		System.out.println("Enter the marks 1");
		float a = marks.nextFloat();
		System.out.println("Enter the marks 2");
		float b = marks.nextFloat();
		System.out.println("Enter the marks 3");
		float c = marks.nextFloat();
		System.out.println("Enter the marks 4");
		float d = marks.nextFloat();
		System.out.println("Enter the marks 5");
		float e = marks.nextFloat();
		float total=(a+b+c+d+e)/500;
		System.out.println("The total is");
		System.out.println(total);
	}

}
