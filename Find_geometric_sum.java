package recursion;

import java.util.Scanner;

public class Find_geometric_sum {
	public static double Gsum(int k) {
		if(k==0) {
			return 1;
		}
		 double smallAns = Gsum(k - 1);
		 return smallAns + 1.0 / Math.pow(2, k);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k;
		k=s.nextInt();
		System.out.println(Gsum(k));

	}

}
