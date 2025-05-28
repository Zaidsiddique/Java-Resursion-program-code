package recursion;

import java.util.Scanner;

public class Check_number_in_array {
	public static boolean checknumber(int input[] , int x , int startindex) {
		if(startindex == input.length) {
			return false;
		}
		if(input[startindex]==x) {
			return true;
		}return checknumber(input , x , startindex + 1);
	}
	public static boolean checknumber(int input[] , int x) {
		return checknumber(input , x , 0);
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
		System.out.println(checknumber(input , x));
	}

}
