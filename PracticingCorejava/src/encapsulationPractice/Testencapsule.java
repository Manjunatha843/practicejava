package encapsulationPractice;

public class Testencapsule {
public static void main(String[] args) {
	Encapsulate en=new Encapsulate();
en.setMyName("manju");
en.setMyAge(25);
en.setMySalary(50000);
System.out.println("my name is:"+en.getMyName());
System.out.println("my age is :"+en.getMyAge());
System.out.println("my salary is:"+en.getMySalary());
}
}
