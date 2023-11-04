package throwmodel;

public class ThrowDemo {
	
	public static void main(String[] args) {
		
		
		try {
			methodMalfunction("java1");
		} catch (Exception e) {
			System.out.println(e);
		}catch (MyError e) {
			System.out.println(e);
		}
		
	}
	
	static String methodMalfunction(String name)throws MyError {
		if(name=="java") {
			
		}else {
			MyError exp=new MyError("name differs", "only accepts java");
			throw exp;
		}
		return "ok";
	}
}
