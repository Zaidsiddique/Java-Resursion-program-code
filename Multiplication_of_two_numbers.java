package recursion;

import java.util.Scanner;

public class Multiplication_of_two_numbers {
	public static int multiplication(int m , int n) {
		if(n==1) {
			return m;
		}
		int smallAns=multiplication(m , n-1);
		return m+smallAns;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m,n;
		n = s.nextInt();
		m = s.nextInt();
		System.out.println(multiplication(m,n));

	}

}
