package javapractices;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class CharacterCountByMap {

	public static void main(String[] args) {

		String str = "Welcome to codedisha";
		// W = 1 e = 3 l = 1 c = 2 o = 2 m = 1 t = 1 a = 2 d = 1 i = 1 s = 1 h = 1

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {

			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}

		}

		Set<Entry<Character, Integer>> set = map.entrySet();

		for (Entry<Character, Integer> entry : set) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		System.out.println("###########################################################");

		map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));

	}

}
