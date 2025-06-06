package recursion;

import java.util.Scanner;

public class Find_First_index {
	public static int firstIndex(int input[],int x, int startIndex) {
		if(startIndex == input.length) {
			return -1;
		}
		if(input[startIndex]==x) {
			return startIndex;
		}
		return firstIndex(input , x , startIndex+1);
	}
	public static int firstIndex(int input[], int x) {
		return firstIndex(input , x , 0);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int input [] = new int [n];
		for (int i=0 ; i < n ; i++) {
			input[i]=s.nextInt();
		}
		int x;
		System.out.println("enter a number you want to check");
		x=s.nextInt();
		System.out.println(firstIndex(input , x));

	}

}
