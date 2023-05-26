package practicingList;
import java.util.*;
public class ListPractice {
public static void main(String[] args) {
	List<Integer> l1=new ArrayList<Integer>();
	l1.add(0, 1);
	l1.add(1, 2);
	System.out.println(l1);
	List<Integer> l2=new ArrayList<Integer>();
	l2.add(3);
	l2.add(4);
	l2.add(5);
	System.out.println(l2);
	l2.addAll(l1);
	System.out.println(l2);
	//Collections.sort(l2);
	//System.out.println(l2);
	//l1.remove(1);
	System.out.println(l1);
	System.out.println(l2.get(2));
	//to replace 0th element with 5
	l1.set(0, 5);
	System.out.println(l1);
	int index=l1.indexOf(5);
	System.out.println(index);
	//iterating using for loop
	for(int i=0;i<l2.size();i++) {
		System.out.print(l2.get(i)+" ");
	}
}
}
