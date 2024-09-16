package week1.day3;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		for(int i=0;i<8;i++)
		{
		    c=a+b;
		    System.out.println("Fibonacci Series for range "+" "+c);
		    a=b;
			b=c;

		}
	}

}
