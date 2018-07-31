package cocktailsort;

public class CockTailSort {
	public void Sort(int[] a) {
		boolean isSorted = true;
		for (int i = 0; i < a.length / 2 + 1; i++) {
			for (int j = i; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				break;
			}
			for (int k = a.length - 1; k > i; k--) {
				if (a[k] < a[k - 1]) {
					int temp = a[k];
					a[k] = a[k - 1];
					a[k - 1] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				break;
			}
			isSorted = true;
		}
	}

	public static void main(String[] args) {
		CockTailSort cts = new CockTailSort();
		int a[] = new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 1 };
		cts.Sort(a);
		for (int s : a) {
			System.out.print(s + " ");
		}
	}

}
