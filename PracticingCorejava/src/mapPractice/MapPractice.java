package mapPractice;
import java.util.*;
public class MapPractice {
public static void main(String[] args) {
	Map<Integer,String> m=new HashMap<Integer,String>();
	m.put(1, "manju");
	m.put(2, "ram charan");
	m.put(3, "pawan");
	m.put(4, "rajamouli");
	m.put(5, "rgv");
	System.out.println(m);

	//iterating using for loop
	for(Map.Entry<Integer, String>e:m.entrySet()) {
		System.out.print(e.getKey()+"   "+e.getValue());
	}
}
}
