package AssistedPractice;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//implicit conversion
		System.out.println("Implicit type Casting");
		char a='Z';
		System.out.println("value of a : "+a);
		
		int b=a;
		System.out.println("value of b : "+b);
		
		float c=a;
		System.out.println("value of c : "+c);
		
		long d=a;
		System.out.println("value of d : "+d);
		
		double e=a;
		System.out.println("value of e : "+e);
		
		System.out.println("\n");
		
		//Explicit conversion
		
		System.out.println("Explicit type Casting");
		
		int x=455;
		float y=(float)x;
		System.out.println("value of x:"+x);
		System.out.println("value of y:"+y);
		
		
	}

}
