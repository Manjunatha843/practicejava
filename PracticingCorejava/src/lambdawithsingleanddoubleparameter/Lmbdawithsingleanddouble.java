package lambdawithsingleanddoubleparameter;

public class Lmbdawithsingleanddouble {
public static void main(String[] args) {
	Shape s=(color)->{return "blue"+" "+color;};
	System.out.println(s.say("color"));
}
}
