import java.util.HashMap;
import java.util.Set;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int total = 0;
		Set<String> keys = hashmap1.keySet();
		Object[] key = keys.toArray();
		for(int i = 0; i < key.length; i++) {
			if(hashmap2.containsKey(key[i].toString())) {
				//It has the key
				if(hashmap1.get(key[i]).equals(hashmap2.get(key[i]))) {
					total++;
					System.out.println(key[i]);
					System.out.println(hashmap1.get(key[i]));
				}
			}
		}
		return total;
	}

}
