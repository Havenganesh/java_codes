package encapsulation1;
       //pacakgename.classname
import encapsulation.*;

public class Defaultdemo {
	private static void main(String[] args) {
		PrivateClass p1 =new PrivateClass("p1", 0);
		DefaultLevel d1 = new DefaultLevel("hi");
		System.out.println(d1.getname());
	}

}
