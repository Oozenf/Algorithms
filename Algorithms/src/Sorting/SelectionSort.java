package Sorting;


public class SelectionSort {
	
	static void selectionSort(int[] arr) {
		
		// best, worst, average case : O(n^2)
		
		for (int i = 0; i < arr.length-1; i++) {
			
			int minIndex = i ;
			
			// ikiser ikiser bakilip min olanin indexi tutulur.
			for(int j = i + 1 ; j < arr.length ; j++ ) {
				if(arr[minIndex] > arr[j])
					minIndex = j; 
			}
			
			// min olan basa atilir.
			int temp = arr[minIndex] ;
			arr[minIndex] = arr [i];
			arr[i] = temp ;
			
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr = {2, 0, 4, -6, 10, 3};

		selectionSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print (arr[i] + ", ");	
			
		}
	}

}
