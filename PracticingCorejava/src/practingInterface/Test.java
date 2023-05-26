package practingInterface;

public class Test {
public static void main(String[] args) {
	Circle c=new Circle();
	c.color();
	Shape.printColor();//we cant access the static method using reference we should use the class name
}
}
