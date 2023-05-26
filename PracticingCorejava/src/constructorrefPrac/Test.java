package constructorrefPrac;

public class Test {
public static void main(String[] args) {
	 interfac i=Sample::new;
	Sample s1=i.get();
	System.out.println(s1);
}
}
