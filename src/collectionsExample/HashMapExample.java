package collectionsExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Aman");
		hm.put(2, "Chaman");
		hm.put(3, "Sanam");
		hm.put(4, "Daman");
		hm.put(4, "Raman");

		Random random = new Random();

		int key = random.nextInt(100);

		for (Map.Entry<Integer, String> sibling : hm.entrySet()) {
			
			if (key != sibling.getKey()) {
				hm.put(key, "Karam");
			}

		}

	}

}
