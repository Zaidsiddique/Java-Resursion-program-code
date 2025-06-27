package recursion;

import java.util.Scanner;

public class Sum_of_array {
	public static int sum(int input[] , int startindex) {
		if(startindex == input.length) {
			return 0;
		}
		int smallAns=sum(input,startindex + 1);
		return input[startindex]+smallAns;
	}
	public static int sum(int input[]) {
		return sum(input , 0);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int input [] = new int [n];
		for (int i=0 ; i < n ; i++) {
			input[i]=s.nextInt();
		}
		int ans = sum(input);
		System.out.println(ans);

	}

}
