package Sorting;


public class BubbleSort {
	
	// best case : O(n) 
	// worst , average case : O(n^2)
	
	static void bubbleSort(int arr[]) {
		
		// boyutunun bir eksigi kadar iteration .
		for(int i=0 ; i<arr.length-1 ; i++) {
			
			
			boolean swapped = false;
			
			// ikili karsilastirmada büyük olan saga kaydirilir
			for(int j=0 ; j<arr.length-i-1 ; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
								
			}
			
			if(swapped==false)
				 break;
		}
		
	}

	public static void main(String[] args) {

		int[] arr = {2, 0, 4, -6, 10, 3};
		
		bubbleSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print (arr[i] + ", ");		
		}
		
				
	}
	
	

}
