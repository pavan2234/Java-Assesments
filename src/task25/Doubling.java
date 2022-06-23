package task25;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Doubling {

	public static void main(String[] args) {
		{
	        Consumer<List<Integer> > modify = list ->
	        {
	            for (int i = 0; i < list.size(); i++)
	                list.set(i, 2 * list.get(i));
	        };
	        Consumer<List<Integer> >
	            dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
	 
	        List<Integer> list = new ArrayList<Integer>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        list.add(6);
	        list.add(7);
	        modify.andThen(dispList).accept(list);
	        ;
	    }
	}

	}
