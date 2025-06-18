package recursion;

public class Print_all_subsequence_from_the_given_stinrg {
	public static void printsubsequence(String input , String output) {
		if(input.length() == 0) {
			System.out.println(output);
			return;
		}
		printsubsequence(input.substring(1) , output);
		printsubsequence(input.substring(1) , output + input.charAt(0));
	}
	public static void printsubsequence(String input) {
		printsubsequence(input , "");
	}

	public static void main(String[] args) {
		printsubsequence("xyz");

	}

}
