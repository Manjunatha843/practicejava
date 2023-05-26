package exceptionpractice;
import java.util.Scanner;
public class ThrowPractice {
public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	System.out.println("enter the value");
	int s=sc.nextInt();
	try {
	if(s<0) {
		throw new IllegalArgumentException();
	}
	}catch(IllegalArgumentException e) {
		System.out.println("ended");
	}
}
}
