package by.it_academy_arrays;

//6. Удаление повторяющихся элементов
// Дан массив целых чисел A длиной N. Создайте новый массив B, содержащий все уникальные элементы массива A в порядке их первого вхождения.
public class Arrays06 {

	public static void main(String[] args) {
		int n = 7;
		int k = 10;
		int[] a = new int[n];
		int[] c = new int[n];

		Arrays05.init(a, k);
		Arrays01.print(a);

		int[] b = new int[lengthArrB(a, c)];
		int temp = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 0) {
				b[temp] = a[i];
				temp++;
			}
		}

		Arrays01.print(b);
	}

	public static int lengthArrB(int[] a, int[] c) {
		int count = 0;
		int lengthB = 0;
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == a[i] && i > j) {
					temp++;
					count++;
				}
			}
			c[i] = temp;
			if (temp == 0) {
				lengthB++;
			}
		}
		return lengthB;
	}
}
