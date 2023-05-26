package streamsPakage;
import java.util.*;
import java.util.stream.*;
public class ArrayTest {
public static void main(String[] args) {
	ArrayList<Integer>l=new ArrayList<Integer>();
	l.add(0);
	l.add(10);
	l.add(15);
	l.add(20);
	l.add(25);
	l.add(30);
	System.out.println(l);
	//to filter only even numbers
	List<Integer>l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(l2);
	
}
}
