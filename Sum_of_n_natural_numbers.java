package recursion;

public class Sum_of_n_natural_numbers {
	public static int sum(int n) {
		
		if(n==1) {
			return 1;
		}
		return sum(n-1)+n;
	}

	public static void main(String[] args) {
		int n=6;
		int x=sum(n);
		System.out.print(x);
	}

}
