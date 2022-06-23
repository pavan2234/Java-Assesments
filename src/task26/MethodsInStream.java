package task26;

import java.util.Optional;
import java.util.StringJoiner;

public class MethodsInStream {

	public static void main(String[] args) {
		StringJoiner joiner=new StringJoiner(",");  //String joiner
		joiner.add("Pavan");
		joiner.add("Ram");
		joiner.add("Kailash");
		System.out.println(joiner);
		System.out.println("    By using optional class :");
		String[] str=new String[10];
		str[6]="i am here";
		str[5]="I AM PAVAN";
		Optional<String> checknull=Optional.ofNullable(str[6]);
		Optional<String> checknulll=Optional.ofNullable(str[6]);
		if(checknull.isPresent() || checknulll.isPresent()) {
			String i=str[6].toUpperCase();
			String j=str[5].toLowerCase();
			System.out.println(i);
			System.out.println(j);
		}
		else {
			System.out.println("Exception is there.");
		}

	}

}
