package OOP;
public class OverloadingExample {
	OverloadingExample() {
		System.out.println("Default Constructor Called");
	}

	OverloadingExample(int a) {
		System.out.println("Parameterized constructor called with value " + a);
	}

	void add(int a, int b) {
		System.out.println("Sum of two Integers: " + (a + b));
	}

	void add(double a, double b) {
		System.out.println("Sum of two Doubles: " + (a + b));
	}

	public static void main(String[] args) {
		OverloadingExample obj1 = new OverloadingExample();
		OverloadingExample obj2 = new OverloadingExample(42);
		obj1.add(5, 10);
		obj1.add(2.5, 5.5);
	}
}