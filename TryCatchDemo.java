package AssistedPractice;

public class TryCatchDemo {

	public static void main(String[] args) {
		 try {
	            
	            int result = divide(10, 0); 
	            System.out.println("Result: " + result); 
	        } catch (ArithmeticException e) {
	            System.err.println("An error occurred: " + e.getMessage());
	        }

	        System.out.println("Program continues after the try-catch block.");
	    }

	    public static int divide(int numerator, int denominator) {
	        return numerator / denominator;	
	
	
	}

}
