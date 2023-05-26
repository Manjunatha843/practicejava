package practingInterface;

public interface Shape {
	static void printColor() {
		System.out.println("printing the color of ststic method");
	}
	/*
	default void printColor() {
		
		// example of default methods
		System.out.println("the color of sky is blue");
	}
	*/
void color();
}
