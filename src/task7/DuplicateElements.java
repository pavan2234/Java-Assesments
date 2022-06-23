package task7;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {
	

	public static void main(String[] args) {
	int[] name = {1,1,2,2,3,3,4,4,5};
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	for (Integer key:name) {
		if (map.containsKey(key)) {
			map.put(key,map.get(key)+1);
		}
		else {
			map.put(key, 1);
		}
	}
	System.out.println(map);

	}

}
