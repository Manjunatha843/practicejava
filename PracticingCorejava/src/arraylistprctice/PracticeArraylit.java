package arraylistprctice;
import java.util.*;
public class PracticeArraylit {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("manju");
	al.add("puli");
	ArrayList<String> al1=new ArrayList<String>(5);
	al1.add("sidhu");
	System.out.println(al1);
	al1.addAll(al);
	System.out.println(al1);
	al1.add(0, "ram");
	System.out.println(al1);
	al1.remove(0);
	System.out.println(al1);
	ArrayList<String> al2=new ArrayList<String>(al1);
	System.out.println(al2);
}
}
