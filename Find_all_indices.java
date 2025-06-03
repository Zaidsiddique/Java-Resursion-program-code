package recursion;

public class Find_all_indices {
	public static int findallindics(int input[] , int x , int startIndex ) {
		if(startIndex == input.length) {
			return 0;
		}
		int ans= findallindics(input , x , startIndex+1);
		if(input[startIndex] == x) {
			return ans+1;
		}
		return ans;
	}
	public static int findallindics(int input[] , int x ) {
		return findallindics(input , x, 0);
	}

	public static void main(String[] args) {
		int x=3;
		int input[]= {1,4,3,2,3,4,3,};
		System.out.println(findallindics(input , x));

	}

}
