package by.it_academy_arrays;
//5. Подсчет частоты элементов
// Дан массив целых чисел A длиной N, содержащий числа в диапазоне от 1 до K.
// Создайте массив F длиной K, где каждый элемент F[i] содержит количество вхождений числа i в массиве A.
public class Arrays05 {

	public static void main(String[] args) {
		int n = 5;
		int k = 10;
		int[] a = new int[n];

		init(a, k);
		Arrays01.print(a);
		int[] f = new int[k];
		arrF(a, f, k);
		Arrays01.print(f);
	}

	public static void init(int[] a, int k) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (1 + Math.random() * (k - 1));
		}
	}

	public static void arrF(int[] a, int[] f, int k) {
		for (int i = 0; i < f.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					count++;
				}
			}
			f[i] = count;
		}
	}
}
