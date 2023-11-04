package encapsulation;

public class DefaultLevel {
	private String name="default";
	private static String className;
	
	private DefaultLevel() {
	}
	public DefaultLevel(String name) {
		this();
	}
	
	public String getname() {
		return name;
	}
	
	public static String getClassName() {
		return className;
	}
	

}
