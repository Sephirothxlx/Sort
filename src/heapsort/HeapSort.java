package heapsort;

public class HeapSort {
	public void maxHeapify(int[] a, int i,int length) {
		int l = 2 * i;
		int r = 2 * i + 1;
		int largest = 0;
		if (l <= length && a[l] > a[i]) {
			largest = l;
		} else {
			largest = i;
		}
		if (r <= length && a[r] > a[l])
			largest = r;
		if (largest != i) {
			swap(a, i, largest);
			maxHeapify(a, largest,length);
		}
	}

	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	public void buildHeap(int []a){
		for(int i=a.length/2;i>=1;i--){
			maxHeapify(a,i,a.length);
		}
		
	}
	public void heapSort(int []a){
		buildHeap(a);
		for(int i=a.length;i>=2;i--){
			//出队
			swap(a,i,1);
			maxHeapify(a,1,a.length-1);
		}
	}
}
