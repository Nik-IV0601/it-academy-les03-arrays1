package by.it_academy_arrays;

//3. Объединение и сортировка двух массивов
// Даны два отсортированных по возрастанию массива целых чисел A длиной N и B длиной M.
// Объедините эти массивы в один отсортированный по возрастанию массив C длиной N + M.

import java.util.Random;
import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {

		int n = 5;
		int m = 4;
		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[n + m];

		initSort(a);
		Arrays01.print(a);
		initSort(b);
		Arrays01.print(b);

		for (int i = 0; i < c.length; i++) {
			if (i < n) {
				c[i] = a[i];
			} else {
				c[i] = b[i - n];
			}
		}
		Arrays.sort(c);
		Arrays01.print(c);
	}

	public static void initSort(int[] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10);
		}
		Arrays.sort(a);
	}
}
