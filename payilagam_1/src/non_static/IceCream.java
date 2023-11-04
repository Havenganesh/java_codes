package non_static;

public class IceCream {
	String brand;
	String flovour;
	String type;
	int price;
	int quntity;
	
	boolean isSweet() {
		if (type == "vanilla" || type == "stawberry" || type == "chocolate" || type == "buttorscotch") {
			return true;
		}
		return false;
	}
	
	static boolean isSweet(String type) {
		if (type == "vanilla" || type == "stawberry" || type == "chocolate" || type == "buttorscotch") {
			return true;
		}
		return false;
	}

}

class Chocolate{
	static boolean isSweet(String type) {
	return true;
	}
}
