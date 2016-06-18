public class BubbleSort {
	public static void bubbleSort(int[] source) {
		for (int i = source.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (source[j] > source[j + 1]) {
					swap(source, j, j + 1);
				}
			}
		}
	}

	private static void swap(int[] source, int x, int y) {
		int temp = source[x];
		source[x] = source[y];
		source[y] = temp;
	}

	public static void main(String[] args) {
		int[] a = { 4, 2, 1, 6, 3, 6, 0, -5, 1, 1 };
		bubbleSort(a);
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", a[i]);
		}
	}
}
