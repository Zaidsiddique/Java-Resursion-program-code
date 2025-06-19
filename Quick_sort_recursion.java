package recursion;

public class Quick_sort_recursion {
	public static int partition (int input[] , int si , int ei) {
	    int pivot = input[si];
	    int count = 0;
	    for (int i = si + 1; i <= ei; i++) {
	        if (input[i] <= pivot) {
	            count++;
	        }
	    }

	    int pi = si + count;
	    
	    int temp = input[si];
	    input[si] = input[pi];
	    input[pi] = temp;

	    int i = si, j = ei;

	    while (i < pi && j > pi) {
	        while (input[i] <= pivot) {
	            i++;
	        }
	        while (input[j] > pivot) {
	            j--;
	        }
	        if (i < pi && j > pi) {
	            int temp2 = input[i];
	            input[i] = input[j];
	            input[j] = temp2;
	            i++;
	            j--;
	        }
	    }
	    return pi;
	}

	public static void quicksort(int input[] , int si , int ei) {
	    if (si >= ei) {
	        return;
	    }
	    int pI = partition(input , si , ei);
	    quicksort(input , si , pI - 1);
	    quicksort(input , pI + 1 , ei);
	}

	public static void quicksort(int input[]) {
	    quicksort(input , 0 , input.length - 1);
	}

	public static void main(String[] args) {
		int input[] = {9,4,5,2,6,4,1,8};
		quicksort(input);
		for(int i=0 ; i<input.length ; i++) {
			System.out.println(input[i]);
		}

	}

}
