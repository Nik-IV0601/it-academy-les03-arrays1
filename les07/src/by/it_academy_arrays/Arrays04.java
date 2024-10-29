package by.it_academy_arrays;

//4. Поиск второго максимального элемента
// Дан массив целых чисел A длиной N. Найдите второй по величине элемент массива без использования встроенных функций сортировки.

import java.util.Random;

public class Arrays04 {

	public static void main(String[] args) {

		int n = 6;
		int[] a = new int[n];
//		int[] a = { 5, 5, 5, 5, 5 }; // Для проверки на случай массива одинаковых элементов
		Arrays01.init(a);
		Arrays01.print(a);
		sort(a);
		Arrays01.print(a);
		answer(a);

	}

	public static void sort(int[] a) {
		int temp;
		for (int j = a.length - 1; j > 0; j--) {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] < a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
	}

	public static void answer(int[] a) {
		int count = 1;
		for (int i = 1; i < a.length; i++)
			if (a[0] == a[i]) {
				count++;
			}
		if (count == a.length) {
			System.out.printf("Все элементы массива одинаковы и равны %d", a[0]);
		} else {
			System.out.printf("Второй по величине элемент массива : %d", a[count]);
		}
	}
}
