package streamsPakage;
import java.util.*;
import java.util.stream.*;
public class MinandMax {
public static void main(String[] args) {
	ArrayList<Integer>marks=new ArrayList<Integer>();
	marks.add(0);
	marks.add(45);
	marks.add(10);
	marks.add(15);
	marks.add(20);
	marks.add(25);
	marks.add(30);
	System.out.println(marks);
	//to grace marksist());
	Integer min=marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(min);
	Integer max=marks.stream().max((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(max);
}
}
