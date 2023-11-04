package collectionP;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	public static void main(String[] args) {
		//array list growable , asyncronized not thread safe but fast
		//vector syncronized, thread safe but slow,one thread at a time
		Collection c1=new ArrayList();
		//add new object
		c1.add("one");
		c1.add("teo");
		c1.add(6987);
		c1.add(6988.23);
		//check for a object
		c1.contains("teo");
		Collection c2=new ArrayList();
		//add another collection
		c1.addAll(c2);
		//it give the iterator
		 Iterator iter=c1.iterator();
		 //throught this iterator we will do while operations
		 while(iter.hasNext()) {
			 System.out.println(iter.next());
		 }
		
		
		
	}

}
