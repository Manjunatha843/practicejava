package practicingList;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class SetinterfacePractice {
public static void main(String[] args) {
	Set<String> names=new HashSet<String>();
	names.add("manju");
	names.add("puli");
	names.add("raghu");
	names.add("reddy");
	System.out.println(names);
	//iterating via for each loop
	for(String value:names) {
		System.out.print(value+"  ");
	}
	System.out.println();
	//iterating through iterators
	Iterator<String> i=names.iterator();
	while(i.hasNext()) {
		System.out.print(i.next()+"  ");
	}
	System.out.println();
	//duplicate values re not allowed in List interface
	names.add("manju");
	System.out.println(names);
}



}
