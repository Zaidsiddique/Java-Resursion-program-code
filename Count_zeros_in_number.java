package recursion;

import java.util.Scanner;

public class Count_zeros_in_number {
	public static int zeros(int input) {
		if(input < 10) {
			if(input == 0) {
				return 1;
			}else {
				return 0;
			}
		}
		if(input % 10 == 0) {
			return zeros(input / 10)+1;
		}else {
			return zeros(input / 10);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input;
		input = s.nextInt();
		System.out.println(zeros(input));

	}

}
