package lt.lhu.unit04.main;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		int x, y, nod, nok, c = 0;
		
		x = inputDoubleFromConsole("Введите первое число: ");
		y = inputDoubleFromConsole("Введите второе число: ");

		nod = nod(x, y, c);
		nok = x * y / nod;
		
		System.out.print("nod = " + nod + "; nok = " + nok);
	}

	public static int nod(int x, int y, int c) {

		while (x != 0 && y != 0) {
			if (x > y) {
				x = x % y;
			} else {
				y = y % x;
			}
		}
		return c = x + y;
	}

	public static int inputDoubleFromConsole(String message) {
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Неверный ввод. " + message);
		}
		value = sc.nextInt();
		return value;
	}
}
