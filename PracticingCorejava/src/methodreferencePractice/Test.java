package methodreferencePractice;

public class Test {
/*public static void m1() {
	for(int i=0;i<10;i++) {
		System.out.println("the child class");
	}
}
*/
public  void m1() {
	for(int i=0;i<10;i++) {
		System.out.println("the child class");
	}
}

public static void main(String[] args) {
	Test p=new Test();
	Runnable r=p::m1;
	//for sttic Runnable r=Test::m1;
	Thread t=new Thread(r);
	t.start();
	for(int i=0;i<10;i++) {
		System.out.println("parent class");
	}
}
}
