package collectionP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlistDemo {
	public static void main(String[] args) {
		ArrayList arr1=new ArrayList();
		arr1.add("india");
		arr1.add("australia");
		arr1.add(1000);
		
		arr1.add(1, "afghanistan");
		ArrayList arr2=new ArrayList();
		arr2.add("germany");
		arr2.add("london");
		arr1.addAll(arr2);
		arr1.add("india");
		
		System.out.println(arr1.indexOf("germany")); 
		System.out.println(arr1.lastIndexOf("india")); 
		List sub= arr1.subList(0, 7);
	
		
		System.out.println(sub);
//		Iterator iter=arr1.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
	}

}
