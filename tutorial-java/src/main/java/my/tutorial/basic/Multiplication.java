package my.tutorial.basic;

public class Multiplication {

	
	public static int multiplyWithRecursive(int x, int y) {
		
		if(y==0) {
			return 0;
		}
		
		if(y>0) {
			return (x + multiplyWithRecursive(x, y-1));
		}
		
		if(y<0) {
			return -multiplyWithRecursive(x,-y);
		}
		return -1;
	}
	
	
	/**
	 * Function to multiply two numbers using Russian Peasant method
	 * https://www.geeksforgeeks.org/russian-peasant-multiply-two-numbers-using-bitwise-operators/
	 * @param a
	 * @param b
	 * @return
	 */
    public static int russianPeasant(int a, int b) 
    { 
        // initialize result 
        int res = 0;   
   
        // While second number doesn't become 1 
        while (b > 0) 
        { 
             // If second number becomes odd,  
             // add the first number to result 
             if ((b & 1) != 0) 
                 res = res + a; 
   
            // Double the first number  
            // and halve the second number 
            a = a << 1; 
            b = b >> 1; 
        } 
        return res; 
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Multiplication of 2 * -3:  "+multiplyWithRecursive(2, -3));
		
		System.out.println("------------------------");
		System.out.println("| Russion Peasant      |");
		System.out.println("------------------------");
		System.out.println(russianPeasant(18, 1)); 
        System.out.println(russianPeasant(20, 12)); 

	}

}
