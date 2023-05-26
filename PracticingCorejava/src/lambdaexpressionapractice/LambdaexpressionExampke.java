package lambdaexpressionapractice;

public class LambdaexpressionExampke {
public static void main(String[] args) {
	int width=10;
	Drawable d=()->{System.out.println("the width is:"+width);};
	d.draw();
}
}
