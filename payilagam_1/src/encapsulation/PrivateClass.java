package encapsulation;

public class PrivateClass {
	private String name;
	private int Password;
	int id;

	public PrivateClass(String name, int password) {
		this.name = name;
		this.Password = password;
	}

	public String getName(int password) {
		if (this.Password == password) {
			return name;
		}
		return "please enter the correct password";
	}

	public boolean setName(String name, int Password) {
		if (Password == this.Password) {
			this.name = name;
			return true;
		}
		return false;
	}

	private void insertValue(String value) {
		// db.insert(value);
	}

	public void insertData(String value, int password) {
		if (password == this.Password) {
			insertValue(value);
		}
	}

}
