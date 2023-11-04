package collectionP;


import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();

		map1.put("one", 1);
		map1.put("two", 2);		
		map1.put("three", 3);
		map1.put("four", 4);
		var eSet=map1.entrySet();
		System.out.println(eSet);
		
	
		
		
		
	}

}
