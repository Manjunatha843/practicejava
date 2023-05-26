package streamsPakage;
import java.util.*;
import java.util.stream.*;
public class MapPractice {
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
	List<Integer>updatedmarks=marks.stream().map(i->i+5).collect(Collectors.toList());
	List<Integer>sortingindec=marks.stream().sorted((i1,i2)->(i1>i2)?1:(i1<i2)?-1:0).collect(Collectors.toList());
	System.out.println(sortingindec);
	long nobelow25=marks.stream().map(m->m<=25).count();
	System.out.println(nobelow25);
	System.out.println(updatedmarks);
	
}
}
