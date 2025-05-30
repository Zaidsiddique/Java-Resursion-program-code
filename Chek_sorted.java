package recursion;

import java.util.Scanner;

public class Chek_sorted {
	public static boolean checksorted(int input[]) {
		if (input.length <= 1) {
			return true;
		}
		int smallInput []= new int [input.length-1];
		for(int i=1; i<input.length ; i++) {
			smallInput [i-1] = input[i]; 
		}
		boolean smallAns = checksorted(smallInput);
		if(!smallAns) {
			return false;
		}
		if(input[0]<=input[1]) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean checksorted_2(int input[]) {
		if (input.length <= 1) {
			return true;
		}
		if(input[0]>input[1]) {
			return false;
		}
		int smallInput []= new int [input.length-1];
		for(int i=1; i<input.length ; i++) {
			smallInput [i-1] = input[i]; 
		}
		boolean smallAns = checksorted_2(smallInput);
		return smallAns;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n=s.nextInt();
		int input [] = new int [n];
		for (int i=0 ; i < n ; i++) {
			input[i]=s.nextInt();
		}
		boolean a=checksorted_2(input);
		System.out.println(a);
	}

}
