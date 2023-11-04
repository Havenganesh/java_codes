package throwmodel;

public class MyError extends Throwable {
	String error;
	String message;
	
	public MyError(String error,String message) {
		this.error=error;
		this.message=message;
	}
	public String toString() {
		String value="{ this is error : "+error+"}\n{ this is message : "+message+"}";
		return value;
	}
}
