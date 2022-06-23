package task23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Calculations {

	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(4);
		num.add(9);
		num.add(9);
		num.add(4);
		Iterator itr = num.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Count operation");
		long ct = num.stream().count();
		System.out.println(ct);
		System.out.println("Sum Operation");
		int sum = num.stream().mapToInt(i->i).sum();
		System.out.println(sum);
		System.out.println("Min operation");
		int min=num.stream().min(Comparator.comparing(Integer :: valueOf)).get();
		System.out.println(min);
		System.out.println("Max operation");
		int max=num.stream().max(Comparator.comparing(Integer :: valueOf)).get();
		System.out.println(max);
		
	}

	}
