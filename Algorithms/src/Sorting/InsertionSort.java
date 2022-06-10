package Sorting;


public class InsertionSort {
	
	// oyun karti dizme sekline benzer
	// best case : O(n)
	// worst , average case : O(n^2)
	static void insertionSort(int[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
								
								// First iteration
			int key = arr[i];  // key = arr[1] = 0 
			int j = i - 1 ;    // j = 0
			
			while(j>=0 && arr[j] > key ) {
				
				arr[j+1] = arr[j];        // arr[1] = 2
				j = j - 1;				 // j = -1	
			}
			
			
			arr[j+1] = key;       // arr[0] = 0
			
			
		}
		
				
	}
	public static void main(String[] args) {
		int[] arr = {2, 0, 4, -6, 10, 3};
		
		insertionSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print (arr[i] + ", ");		
		}
		
	}

}
