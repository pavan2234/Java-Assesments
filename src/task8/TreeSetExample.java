package task8;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
	TreeSet<Object> t = new TreeSet<Object>();
	t.add("pavan");
	t.add("PAVAN");
	t.add("123");
	t.add("paVAN");
	t.add("pavan");
	System.out.println(t);

	}

}
