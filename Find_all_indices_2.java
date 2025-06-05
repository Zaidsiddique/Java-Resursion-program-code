package recursion;

public class Find_all_indices_2 {
	public static int[] allindexes(int input[] , int x , int startIndex) {
		if(startIndex == input.length) {
			int output[] = new int[0];
			return output;
		}
		int smalloutput[] = allindexes(input, x, startIndex + 1);
		
		if(input[startIndex] == x) {
			int output[] = new int[smalloutput.length + 1];
			output[0] = startIndex;
			for (int i = 0; i < smalloutput.length; i++) {
				output[i + 1] = smalloutput[i];
			}
			return output;
		} else {
			return smalloutput;
		}
	}
	public static int[] allindexes(int input[] , int x ) {
		return allindexes(input , x, 0);
	}

	public static void main(String[] args) {
		int input[] = {1, 2, 3, 2, 2, 5};
		int x = 2;
		int[] result = allindexes(input, x);

		for (int i = 0; i < result.length; i++) {
		    System.out.print(result[i] + " ");
		}
	}

}
