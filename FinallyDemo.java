package AssistedPractice;

public class FinallyDemo {

	public static void main(String[] args) {
		try {
			int num=25/5;
			System.out.println(num);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("the execution of final block always happen");
		}
		System.out.println("after final the rest of the code.....");
	}

}
