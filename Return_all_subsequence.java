package recursion;

public class Return_all_subsequence {
	public static String [] findsubsequence(String str) {
		if(str.length() == 0){
			String ans [] = {" "};
			return ans;
		}
		String smallAns[] = findsubsequence(str.substring(1));
		String ans[] = new String [2*smallAns.length];
		int k =0;
		for(int i=0 ; i<smallAns.length ; i++) {
			ans[k] = smallAns[i];
			k++;
		}
		for(int i=0 ; i<smallAns.length ; i++) {
			ans[k] = str.charAt(0)+smallAns[i];
			k++;
		}
		return ans;
	}

	public static void main(String[] args) {
		String str = "xyz";
		String ans[] = findsubsequence(str);
		for(int i=0 ; i<ans.length ; i++) {
			System.out.print(ans[i]);
		}

	}

}
