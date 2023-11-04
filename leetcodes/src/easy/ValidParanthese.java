package easy;

public class ValidParanthese {

	public static void main(String[] args) {
		String s = "()";
		int index = -1;
		char[] cArray = new char[s.length()];
		outer: for (int i = 0; i < s.length(); i++) {
			char symbl = s.charAt(i);
			switch (symbl) {
			case '(', '{', '[':
				index++;
				cArray[index] = symbl;
				break;
			case ')':
				if(index==-1)break outer;
				if (index > -1 && cArray[index] == '(') {
					cArray[index] = ' ';
					index--;
				} else {
					break outer;
				}
				break;
			case '}':
				if(index==-1)break outer;
				if (index > -1 && cArray[index] == '{') {
					cArray[index] = ' ';
					index--;
				} else {
					break outer;
				}
				break;
			case ']':
				if(index==-1)break outer;
				if (index > -1 && cArray[index] == '[') {
					cArray[index] = ' ';
					index--;
				} else {
					break outer;
				}
				break;
			}
		}
		if (index != -1 ||s.length()==1) {
			System.out.println("this is not paired braces");
		} else {
			System.out.println("well paired");
		}

	}

}
