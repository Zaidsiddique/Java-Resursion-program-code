package recursion;

public class Replace_character {
	public static String replace(String str, char a , char b) {
		if(str.length() == 0) {
			return str;
		}
		char c;
		if(str.charAt(0) == a) {
			c = b;
		}else {
			c= str.charAt(0);
		}
		String ans = replace (str.substring(1) , a , b);
		return (c+ans);
	}

	public static void main(String[] args) {
		String str = "bcfbdbbsknb";
		char a = 'b';
		char b = 'x';
		System.out.println(replace (str , a , b));
		
	}

}
