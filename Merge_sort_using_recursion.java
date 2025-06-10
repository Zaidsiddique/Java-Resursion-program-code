package recursion;

public class Merge_sort_using_recursion {
	public static void merge_sort(int[] input) {
	    if (input.length <= 1) {
	        return;
	    }
	    int mid = input.length / 2;
	    int part1[] = new int[mid];
	    int part2[] = new int[input.length - mid];
	    
	    for (int i = 0; i < mid; i++) {
	        part1[i] = input[i];
	    }

	    int k = 0;
	    
	    for (int i = mid; i < input.length; i++) {
	        part2[k] = input[i];
	        k++;
	    }
	    
	    merge_sort(part1);
	    merge_sort(part2);
	    merge(part1, part2, input);
	}

	public static void merge(int part1[], int part2[], int[] input) {
	    int i = 0, j = 0, k = 0;

	    
	    while (i < part1.length && j < part2.length) {
	        if (part1[i] < part2[j]) {
	            input[k] = part1[i];
	            i++;
	        } else {
	            input[k] = part2[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < part1.length) {
	        input[k] = part1[i];
	        i++;
	        k++;
	    }

	    while (j < part2.length) {
	        input[k] = part2[j];
	        j++;
	        k++;
	    }
	}


	public static void main(String[] args) {
		int input [] = {2,5,4,1,7,2,6};
		merge_sort(input);
		for(int i=0 ; i<input.length ; i++) {
			System.out.println(input[i]);
		}

	}

}
