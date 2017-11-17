package codility.lesson.iteration;

public class Fibonacci {
	
	
	public static void main(String args[]) {
		int n=8;
		int a =0;
		int b =1;
		while (a<=n){
			System.out.print(a + " ");
			int c= a+b;
			a=b;
			b=c;
		}
	}

}
