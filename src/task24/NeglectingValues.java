package task24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class ConsumerInterface{
	static void myMethod(List<Integer> list) {
		List<Integer> nls = list.stream().filter(x->x<3||x>7).map(x->x).collect(Collectors.toList()); 
		nls.forEach(n->System.out.println(n));
	}
}
public class NeglectingValues {
	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<Integer>();
		for (int i=1;i<=10;i++) {
			ls.add(i);
		}

		Consumer<List<Integer>> con = ConsumerInterface::myMethod;  
		con.accept(ls);


	}

}
