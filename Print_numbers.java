package recursion;

import java.util.Scanner;

public class Print_numbers {
	public static void print(int n) {
		if(n==1) {
			System.out.println(n+" ");
			return ;
		}
		print (n-1);
		System.out.println(n+" ");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		print(n);
	}

}
