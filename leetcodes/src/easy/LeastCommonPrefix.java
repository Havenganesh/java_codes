package easy;

public class LeastCommonPrefix {

	public static void main(String[] args) {
		String[] array = { "reflower","flow","flight" };

		int length = array[0].length();
		String smallStr = array[0];
		String common = "";
		for (String str : array) {
			if (str.length() < length) {
				length = str.length();
				smallStr = str;
			}
		}
		outer: for (int i = 0; i < smallStr.length(); i++) {
			char letter = smallStr.charAt(i);
			for (int j = 0; j < array.length; j++) {
				if (letter != array[j].charAt(i)) {
					break outer;
				} 
			}
			common=common+letter;
		}
		System.out.println(common);

	}

}
