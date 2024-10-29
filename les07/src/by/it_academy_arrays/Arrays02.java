package by.it_academy_arrays;

import java.util.Scanner;

public class Arrays02 {
	// 2. Проверка массива на палиндром
	// Дан массив символов A длиной N. Определите, является ли этот массив
	// палиндромом (читается одинаково слева направо и справа налево).
	
	public static void main(String[] args) {
		Scanner inpN = new Scanner(System.in);
		System.out.print("Сколько символов будет в Вашей строке? : ");
		int n = inpN.nextInt();
		Scanner inpStr = new Scanner(System.in);
		System.out.printf("Введите строку с количеством символов %d: ", n);
		String str = inpStr.nextLine().toLowerCase(); 
		
		if (str.length() != n) {
			System.out.println("Здесь не такое количество символов");
			return;
		}

	 		char[] a = str.toCharArray();    // Преобразование строки в массив символов
	 		printA(str, a);
	 		polyndrom(a);
	 	}	

	     public static void printA(String str, char[] a) {   // Распечатка элементов массива
	         System.out.print("[");
	 		for (int i = 0; i < a.length; i++) {	
	 			if (i !=a.length-1) {
	 				System.out.printf("%c, ", a[i]);
	 			} else {
	 			    System.out.printf("%c]%n", a[i]);
	 			}
	 		}
	 	}	 

	 	public static void polyndrom(char[] a) {  // Проверка массива на полиндром
	 		for (int i = 0; i < a.length/2; i++) {	
	 			if (a[i] != a[a.length-1-i]) {
	 				System.out.println("Массив не является полиндромом");
	 				return;
	 			}
	 		}System.out.println("Массив таки полиндромом !");
	 	} 
}
