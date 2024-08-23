package projects.dsa;

public class SelectionSort {
	
	public static void sortSelection(int[]arr) {
		
		int n = arr.length;
		
		for(int i=0; i<n-1;i++) {
			int min = i;
			
			for(int j = i+1; j<n; j++) {
				if(arr[j]< arr[min]) {
					min =j;
				}
			}
			
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void main(String[] args) {
        int[] arr = {7, 3, 5, 8, 2, 9, 4, 15, 6};
        
        sortSelection(arr);
        
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}

}
