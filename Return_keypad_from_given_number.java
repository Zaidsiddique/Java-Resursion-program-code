package recursion;

public class Return_keypad_from_given_number {
	public static String getstring(int d) {
	    if(d==2) {
	        return "abc";
	    }
	    if(d==3) {
	        return "def";
	    }
	    if(d==4) {
	        return "ghi";
	    }
	    if(d==5) {
	        return "jkl";
	    }
	    if(d==6) {
	        return "mno";
	    }
	    if(d==7) {
	        return "pqrs";
	    }
	    if(d==8) {
	        return "tuv";
	    }
	    if(d==9) {
	        return "wxyz";
	    }
	    return "";
	}

	public static String[] keypad(int n) {
	    if(n == 0) {
	        String output[] = {""};
	        return output;
	    }

	    String smallnumber[] = keypad(n / 10);
	    String singledigit = getstring(n % 10);
	    String output[] = new String[smallnumber.length * singledigit.length()];
	    
	    int k = 0;
	    for (int a = 0; a < singledigit.length(); a++) {
	        for (int i = 0; i < smallnumber.length; i++) {
	            output[k] = smallnumber[i] + singledigit.charAt(a);
	            k++;
	        }
	    }
	    return output;
	}


	public static void main(String[] args) {
		int n = 23;
		String [] ans = keypad(n);
		for (int i=0 ; i<ans.length ; i++) {
			System.out.println(ans[i]);
		}

	}

}
