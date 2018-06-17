package bubblesort;

public class BubbleSort {
	public static void main(String[] args) {
		int score[] = { 67, 69, 75, 87, 89, 90,87 };
		ArrayUtils.printArray(score);
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length - i - 1; j++) {
				if (score[j] > score[j + 1]) {
					int temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
		}
		ArrayUtils.printArray(score);
	}
}
