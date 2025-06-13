package recursion;

import java.util.Scanner;

public class power {
	public static int p(int x , int n) {
		if(x==0 && n==0) {
			return 0;
		}
		if(x==0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		int smallans=p(x,n/2);
		if (n%2==0) {
			return smallans * smallans;
		}
		else {
			return x*smallans*smallans;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x,n;
		x=s.nextInt();
		n=s.nextInt();
		int y=p(x,n);
		System.out.print(y);

	}

}
