package recursion;

import java.util.Scanner;

public class Numbers_of_digits {
	public static int count(int n) {
		if(n==0) {
			return 0;
		}
		int small = count(n/10);
		int ans = small +1;
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int a = count(n);
		System.out.println(a);
	}

}
