package mergesort;

import insertsort.ArrayUtils;

public class MergeSort {

	public void Merge(int[] a, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		int i=0,j=0;
		for (; i < n1; i++) {
			L[i]=a[p+i];
		}
		for (; j < n2; j++) {
			R[j]=a[q+j+1];
		}
		L[n1]=Integer.MAX_VALUE;
		R[n2]=Integer.MAX_VALUE;
		i=0;
		j=0;
		for(int k=p;k<=r;k++){
			if(L[i]<=R[j]){
				a[k]=L[i];
				i++;
			}else {
				a[k]=R[j];
				j++;
			}
		}
	}

	public void Merge_Sort(int[] a, int p, int r) {
		if (p < r) {
			int m = (p + r) >> 1;
			Merge_Sort(a, p, m);
			Merge_Sort(a, m + 1, r);
			Merge(a, p, m, r);
		}
	}

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int[] a = { 26, 5, 98, 108, 28, 99, 100, 56, 34, 1,1000,40 };
		ArrayUtils.printArray(a);
		ms.Merge_Sort(a, 0, a.length-1);
		ArrayUtils.printArray(a);
	}
}
