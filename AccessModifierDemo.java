package AssistedPractice;


public class AccessModifierDemo {
	
	public int publicvar = 10;
	private int privatevar = 20;
	protected int protectedvar = 30;

	int defaultvar = 40;

	public void publicMethod() {
		System.out.println("this is public modifier");
	}

	private void privateMethod() {
		System.out.println("this is private modifier");
	}

	protected void protectedMethod() {
		System.out.println("this is protected modifier");
	}

	void defaultMethod() {
		System.out.println("this is default modifier");
	}

	public static void main(String[] args) {
		AccessModifierDemo obj = new AccessModifierDemo();
		
		System.out.println("public var:"+obj.publicvar);
		System.out.println("private var:"+obj.privatevar);
		System.out.println("protected var:"+obj.protectedvar);
		System.out.println("default var:"+obj.defaultvar);

		
		
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();

	}

}
