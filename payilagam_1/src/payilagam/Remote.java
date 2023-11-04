package payilagam;

public class Remote {
	static boolean power;
	int channel;
	int volume;
	boolean mute;
	
	public static boolean powerOn() {
		power=true;
		return true;
	}
	public static boolean powerOff() {
		power=false;
		return false;
	}
	
	public int chennelUp() {
		power=false;
		channel++;
		return channel;
	}
	
	public int chennelDown() {
		channel--;
		return channel;
	}
	
	
	

}
