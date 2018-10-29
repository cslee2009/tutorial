package my.tutorial.basic;

public class WithoutLoop {

	public static void printWithoutLoop(int n) {
	
		if(n > 1) {
			printWithoutLoop(n-1);
		}
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(printWithoutLoop(10));
		printWithoutLoop(10);
	}

}
