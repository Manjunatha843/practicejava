package practicingjava;

public class Methodoverlodingex {
public void sum(int a,int b) {
	System.out.println(a+b);
}
public void sum(int a,int b,int c) {
	System.out.println(a+b+c);
}
public static void main(String[] args) {
	Methodoverlodingex moe=new Methodoverlodingex();
	moe.sum(10,20);
	   
	moe.sum(10,20,30);
	
}
}
