public class InsertSort {

	public static void insertSort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			int currentNumber = numbers[i];
			int j = i - 1;
			while (j >= 0 && numbers[j] > currentNumber) {
				numbers[j + 1] = numbers[j];
				j--;
			}
			numbers[j + 1] = currentNumber;
		}
	}

	public static void main(String[] args) {
		int[] a = { 4, 2, 1, 6, 3, 6, 0, -5, 1, 1 };
		insertSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
		}
	}

}
