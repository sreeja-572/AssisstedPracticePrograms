package AssistedPractice;

public class ClassConstructorsObjectsDemo {

	public static void main(String[] args) {
		// object
		Employee emp = new Employee();
		emp.displayName();
	}

}

//class
class Employee {
	String name;

	// constructor
	Employee() {
		name = "sreeja";
	}

	void displayName() {
		System.out.println("name of the employee is " + name);
	}
}