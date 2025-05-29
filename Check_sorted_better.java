package recursion;

import java.util.Scanner;

public class Check_sorted_better {
	public static boolean check_sorted_better(int input[] , int startIndex) {
		if(startIndex == input.length - 1) {
			return true;
		}
		if(input[startIndex] > input[startIndex + 1]) {
			return false;
		}
		boolean smallAns=check_sorted_better(input , startIndex + 1);
		return smallAns;
	}
	public static boolean check_sorted_better (int input[]) {
		return check_sorted_better(input, 0);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int input [] = new int [n];
		for (int i=0 ; i < n ; i++) {
			input[i]=s.nextInt();
		}
		boolean a=check_sorted_better(input);
		System.out.println(a);

	}

}
