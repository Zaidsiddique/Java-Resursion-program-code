package recursion;

import java.util.Scanner;

public class Fabonaci_number {
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int fabonaci = fib(n);
		System.out.println(fabonaci);
	}

}
