package collectionP;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Llist {

	public static void main(String[] args) {
		Set<String> diwali = new HashSet<String>();

		diwali.add("dress");
		diwali.add("cracker");
		diwali.add("sweets");
		diwali.add("snacks");
		diwali.add("dress");
		
		diwali.addAll(diwali);
		
		Iterator iter=diwali.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
