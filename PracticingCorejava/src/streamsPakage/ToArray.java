package streamsPakage;
import java.util.*;
import java.util.stream.*;
public class ToArray {
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
	Integer[] i=marks.stream().toArray(Integer[]::new);
	for(Integer marks1:i) {
		System.out.print(marks1+" ");
	}
}
}
