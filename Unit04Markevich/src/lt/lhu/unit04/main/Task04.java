package lt.lhu.unit04.main;

import java.util.Random;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] mas = new int[6];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(1000);
		}
		System.out.print("Массив: ");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%4d ", mas[i]);
		}

		int d = 1;

		while (d == 1) {

			int i = InputIntFromConsole("\nПосчитать сумму трех последовательных чисел начиная с числа №: ");
			int sam = sam(i, mas);
			d = vvod(sam, d);
		}
		
		System.out.print("\nПодсчет завершен.");
	}

	public static int InputIntFromConsole(String message) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		i = sc.nextInt();
		while (i > 4) {

			System.out.print("\nПодсчет невозможен. " + message);
			i = sc.nextInt();
		}
		i = i - 1;
		return i;
	}

	public static int sam(int i, int[] mas) {
		int sam = 0;
		int n = i + 3;
		for (int x = i; x < n; x++) {
			sam = sam + mas[x];
		}
		return sam;
	}

	public static int vvod(int sam, int d) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nСумма элементов: " + sam + "\n\nВведите 1, чтобы посчитать суммы других элементов. "
				+ "\nВведите 2, чтобы завершить: ");
		d = sc.nextInt();
		return d;
	}
}