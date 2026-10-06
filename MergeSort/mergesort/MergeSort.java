package mergesort;

public class MergeSort {

	public static void main(String[] args) {
		int[] array1 = {11,43,87,27,54,8,32,71,44,12};
		
		showArray(array1);
		Slice(array1, 0, array1.length);
		
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
		int[] left = new int[mid];
		int[] right = new int[mid];
		int lc = 0;
		int rc = 0;
		
		for (int i = start; i < end; i++) {
			if ( i < mid) {
				left[lc] = arr[i];
				lc++;
			}
			if (i > mid) {
				right[rc] = arr[i];
				rc++;
			}
		}
		
		showArray(left);
		System.out.print("U");
		showArray(right);
		
		
		
		
	}
	
	public static void Partition(int[] arr, int start, int end) {
	/*	int mid = (start + end) / 2;
		
		if (start < end) {
			int[]
			for (int i = start; i < end; i++) {
				
			}
		} */
	}

	
	private static void mergeSort(int[] theArray, int left, int right) {
		//**************************************************************
		//*  Recursive Merge Sort                                      *
		//*------------------------------------------------------------*
		//*  1. Divide or partition the array section into 2 halves.   *
		//*  2. Create a subArray for each partition (half)            *
		//*  3. Merge the two subArrays to create one sorted array     *
		//*  4. Replace the original array section with the merged     *
		//*     array.                                                 *
		//**************************************************************

	}
	
	public static void mergeSort(int[] array) {
		//**********************************************
		//*  Class Wrapper for the recursive mergeSort *
		//**********************************************
		mergeSort(array,0,array.length-1);
	}
}
