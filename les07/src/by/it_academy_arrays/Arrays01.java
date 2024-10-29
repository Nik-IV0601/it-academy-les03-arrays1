package by.it_academy_arrays;

// 1. Циклический сдвиг элементов массива
// Дан одномерный целочисленный массив A длиной N и число K.
// Реализуйте алгоритм циклического сдвига элементов массива на K позиций вправо. 
// Элементы, выходящие за пределы массива, должны перемещаться в начало.
import java.util.Scanner;
import java.util.Random;

public class Arrays01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Задайте длину массива: ");
		int n = in.nextInt();
		int[] a = new int[n];

		init(a);
		print(a);
		sdvig(a);
		in.close();
	}

	public static void init(int[] a) {
		Random rand = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(10);
		}
	}

	public static void print(int[] a) {
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			if (i != a.length - 1) {
				System.out.printf("%d, ", a[i]);
			} else {
				System.out.printf("%d]%n", a[i]);
			}
		}
	}

	public static void sdvig(int[] a) {
		Scanner in = new Scanner(System.in);
		System.out.print("Задайте число сдвига: ");
		int k = in.nextInt();
		in.close();
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[(i + k) % b.length] = a[i];
		}
		System.out.print("[");
		for (int i = 0; i < b.length; i++) {
			if (i != b.length - 1) {
				System.out.printf("%d, ", b[i]);
			} else {
				System.out.printf("%d]%n", b[i]);
			}
		}
	}
}
