package task9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList {

	public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	
	Iterator<String> itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	ListIterator<String> listitr = list.listIterator();
	while(listitr.hasNext()) {
		System.out.println(listitr.next());
	}
	
	

	}

}
