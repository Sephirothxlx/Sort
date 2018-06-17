package quicksort;

import java.util.Random;

public class Quicksort {

	private Quicksort() {
	}

	// Your code here
	public static int[] sort(int[] unsorted) {
		quicksort(5,unsorted, 0, unsorted.length - 1);
		return unsorted;
	}

	public static void quicksort(int M,int[] array, int low, int high) {
		if(high>=low){
			int mid = partition(array, low, high);
			quicksort(M,array, low, mid - 1);
			quicksort(M,array, mid + 1, high);
		} 
	}

	public static int partition(int []array, int low, int high) {
		int pivot = array[high]; 
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				swap(array,i,j);
			}
		}
		i++;
		swap(array,i,high);
		return i;
	}
	
	public int test(int []array, int low, int high){
		int i=low-1;
		int pivot=array[high];
		for(int j=low;j<=high;j++){
			if(array[j]<=pivot){
				i++;
				swap(array,i,j);
			}
		}
		swap(array,i+1,high);
		return i+1;
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void insertion(int[] array, int l, int r) {
		for (int i = l + 1; i <= r; i++)
			for (int j = i; (j > l) && array[j] < array[j - 1]; j--)
				swap(array, j, j - 1);
	}

	// Your code here
	public static void main(String[] args) {
		Random RANDOM = new Random();
		for(int M=0;M<=30;M++){
			int[] unsorted = new int[100000];
	        int i = 0;
	        while (i < unsorted.length) {
	            int j = RANDOM.nextInt(unsorted.length * 10);
	            unsorted[i++] = j;
	        }
			long start=System.currentTimeMillis();
			quicksort(M,unsorted,0,unsorted.length-1);
			long end=System.currentTimeMillis();
			System.out.println(M+":"+(end-start)+"ms");
		}
	}
}
