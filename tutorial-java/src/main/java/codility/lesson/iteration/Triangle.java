package codility.lesson.iteration;


/*
 * To print triangle using iteration 
 */
public class Triangle {

	/*         *
	 *        ***
	 *       *****
	 *      *******
	 */       
	public static void printTriangle1(int row) {
		
		for(int i=1; i <= row ;i ++) {
			for(int j=1; j<=row-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println("");	
			
		}
	}
	
	/*
	 *     $
	 *    $ $
	 *   $ $ $
	 *  $ $ $ $  
	 */
	public static void printTriangle2(int row) {
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row-i; j++) 
				System.out.print(" ");
			
			for(int k=1; k<=i; k++)
				System.out.print("* ");
			System.out.println("");
		}
	}
	
	/*
	 *  *******
	 *   *****
	 *    ***
	 *     *
	 */
	public static void printInvertedTriangle(int row) {
		for(int i=row; i> 0; i--) {
			for(int j =0; j<row-i; j++)
				System.out.print(" ");
			for(int k = 2*i-1; k>0; k-- )
				System.out.print("*");
			System.out.println("");
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        printTriangle1(4);
        System.out.println("");
        printTriangle2(4);
        System.out.println("");
		printInvertedTriangle(5);
	}

}
