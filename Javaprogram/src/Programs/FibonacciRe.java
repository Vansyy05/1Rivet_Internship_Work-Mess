package Programs;

public class FibonacciRe {
		static void Fibon() {
			int a=0,b=1,c =0;
			for(int i=0;i<=10;++i) {
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
				
		}
		}
	public static void main(String args[]) {
		Fibon();
	}
}
