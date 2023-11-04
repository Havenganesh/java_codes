package easy;

public class RomanLetters {
	public static void main(String[] args) {
		System.out.println(romanConvert("CDI"));
	}

	public static int romanConvert(String s) {
		int value = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			var digit = s.charAt(i);
			switch (digit) {
			case 'I':
				value = value + 1;
				break;
			case 'V':
				value = value + 5;
				if (i != 0 && s.charAt(i - 1) == 'I') {
					value = value - 1;
					i--;
				}
				break;
			case 'X':
				value = value + 10;
				if (i != 0 && s.charAt(i - 1) == 'I') {
					value = value - 1;
					i--;
				}
				break;
			case 'L':
				value = value + 50;
				if (i != 0 && s.charAt(i - 1) == 'X') {
					value = value - 10;
					i--;
				}
				break;
			case 'C':
				value = value + 100;
				if (i != 0 && s.charAt(i - 1) == 'X') {
					value = value - 10;
					i--;
				}
				break;
			case 'D':
				value = value + 500;
				if (i != 0 && s.charAt(i - 1) == 'C') {
					value = value - 100;
					i--;
				}
				break;
			case 'M':
				value = value + 1000;
				if (i != 0 && s.charAt(i - 1) == 'C') {
					value = value - 100;
					i--;
				}
				break;
			}
		}
		return value;
	}

}
