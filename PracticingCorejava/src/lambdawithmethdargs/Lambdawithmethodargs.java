package lambdawithmethdargs;

public class Lambdawithmethodargs {
	public static void main(String[] args) {
		display(
				()->{System.out.println("the area of circle is:"+3.14*5*5);}
				);
		
	}
	static void display(Shape s) {
		s.area();
	}

}
