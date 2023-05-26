package practingMultipleinheritance;

public class Test implements Printable,Showable{
	@Override
	public void show() {
		System.out.println("implementing the printable");
	}
	@Override
	public void display() {
		System.out.println("implementing the showable");
	}
public static void main(String[] args) {
	Test t=new Test();
	t.show();
	t.display();
}
}
