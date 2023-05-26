package genericsPractice;

public class TestGenerics {
public static void main(String[] args) {
	Gen<String> g=new Gen<String>();
	g.setName("manju");
	String names=g.getName();
	System.out.println(names);
}
}
