package mergesort;

public class MergeSort {

	public static void main(String[] args) {
		int[] array1 = {11,43,87,27,54,8,32,71,44, 12};
		
		showArray(array1);
		Slice(array1, 0, array1.length);
		mergeSort(array1);
		//mergeSort(array1);
		//showArray(array1);
		
	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<theArray.length;index++) {
			if(index!=0) {
				System.out.printf(", ");
			}
			System.out.printf("%d",theArray[index]);
		}
		System.out.printf("]\n");
	}
	
	public static void Slice(int[] arr, int start, int end) {
		int mid = start + end / 2;
		int[] left;
		int[] right;
		int lc = 0;
		int rc = 0;
		
		if (arr.length % 2 == 0) {
			left = new int[mid];
			right = new int[mid];
		}
		
		else {
			left = new int[mid];
			right = new int[mid + 1];
		}
		
		for (int i = start; i < end; i++) {
			if ( i < mid) {
				left[lc] = arr[i];
				lc++;
			}
			else /*(i >= mid) */{
				right[rc] = arr[i];
				rc++;
			}
		}
		
		showArray(left);
		System.out.print("U");
		showArray(right);
		
		
		
		
	}
	
	public static void Merge(int[] arr, int left, int right, int end) {
		int leftP = left - right ;
		int rightP = end - right;
		int startRight = right;
		
		
		int[] leftArr = new int[leftP];
		int[] rightArr = new int[rightP];
		
		for (int i = 0; i < leftP; i++) {
			leftArr[i] = arr[left + i];
		}
		
		for (int i = 0; i < rightP; i++) {
			rightArr[i] = arr[right + i];
		}	
		
		int indLeft = 0;
		int indRight = 0;
		
		for (int i = left; i < end; i++) {
			if (leftArr[indLeft] <= rightArr[indRight]) {
				arr[i] = leftArr[indLeft];
				indLeft++;
			}
			else {
				arr[i] = rightArr[indRight];
				indRight++;
			}
		}
	}
	
	public static void Partition(int[] arr, int start, int end) {
	/*	int mid = (start + end) / 2;
		
		if (start < end) {
			int[]
			for (int i = start; i < end; i++) {
				
			}
		} */
	}

	
	private static void mergeSort(int[] arr, int start, int end) {
		//**************************************************************
		//*  Recursive Merge Sort                                      *
		//*------------------------------------------------------------*
		//*  1. Divide or partition the array section into 2 halves.   *
		//*  2. Create a subArray for each partition (half)            *
		//*  3. Merge the two subArrays to create one sorted array     *
		//*  4. Replace the original array section with the merged     *
		//*     array.                                                 *
		//**************************************************************

	/*	int mid = (start + end) / 2;
		int[] left;
		int[] right;
		int lc = 0;
		int rc = 0;
		
		if (mid * 2 == end) {
			left = new int[mid];
			right = new int[mid];
		}
		
		else {
			left = new int[mid];
			right = new int[mid + 1];
		}
		
		for (int i = start; i < end; i++) {
			if ( i < mid) {
				left[lc] = arr[i];
				lc++;
			}
			else if (i >= mid) {
				right[rc] = arr[i];
				rc++;
			}
		}
		
		showArray(left);
		System.out.print("U");
		showArray(right);	 */
		
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			Merge(arr, start, mid, end);
			
		}

	}
	
	public static void mergeSort(int[] array) {
		//**********************************************
		//*  Class Wrapper for the recursive mergeSort *
		//**********************************************
		mergeSort(array,0,array.length);
	}
}
