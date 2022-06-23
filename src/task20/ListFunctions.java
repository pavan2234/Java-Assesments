package task20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListFunctions {

	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("pavan");
	list.add("Rakesh");
	list.add("Upendhar");
	list.add("akash");
	list.add("Natraj");
	list.add("SaiTeja");
	list.remove(0);
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	ListIterator obj=list.listIterator(list.size());
	while(obj.hasPrevious()) {
		Object number=obj.previous();
		System.out.println(number);
	}
	ListIterator obj1=list.listIterator(list.size());
	while(obj1.hasNext()) {
		Object number1=obj1.hasNext();
		System.out.println(number1);
	}
	System.out.println("   Index  ");
	ListIterator obj2=list.listIterator(list.size());
	System.out.println("Next index :"+ obj2.nextIndex());
	System.out.println("Previous index :"+obj2.previousIndex());

	}

}
