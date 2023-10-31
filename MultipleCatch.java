package AssistedPractice;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			System.out.println(a[10]);
		}
		catch(ArithmeticException e) {
			System.out.println("arithematic exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("arrayindexoutofbounds exception");
		}
		catch(Exception e) {
			System.out.println("Parent exception");
		}
		System.out.println("rest of the code");
	}
	

}
