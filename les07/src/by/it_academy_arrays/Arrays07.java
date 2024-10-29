package by.it_academy_arrays;

//7. Реверсирование подмассива
// Дан массив целых чисел A длиной N и два индекса L и R, где 0 ≤ L ≤ R < N. Разверните
// элементы массива между индексами L и R включительно, оставив остальные элементы без изменений.
public class Arrays07 {

	public static void main(String[] args) {
		int n = 10;
		int l = 5;
		int r = 7;
		int[] a = new int[n];

		Arrays01.init(a);
		Arrays01.print(a);
		reversArrLR(a, l, r);
	}

	public static void reversArrLR(int[] a, int l, int r) {
		if (l >= 0 && l <= r && r < a.length) {
			for (int i = l; i <= l + (r - l) / 2; i++) {
				int temp = 0;
				temp = a[i];
				a[i] = a[r + l - i];
				a[r + l - i] = temp;
			}
			Arrays01.print(a);
		} else {
			System.out.println("Измените индексы l и/или r");
		}
	}
}
