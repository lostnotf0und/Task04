package lt.lhu.unit04.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, max, min, sum;

		Random rand = new Random();

		a = rand.nextInt(1000);
		b = rand.nextInt(1000);
		c = rand.nextInt(1000);

		System.out.println("Три числа: " + a + ", " + b + ", " + c);

		max = max(a, b, c, max = 0);
		min = min(a, b, c, min = 0);

		sum = max + min;

		System.out.print("Сумма наименьшего и наибольшего: "+ sum);

	}

	public static int max(int a, int b, int c, int max) {
		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else if (c > a && c > b) {
			max = c;
		}
		return max;
	}

	public static int min(int a, int b, int c, int min) {
		if (a < b && a < c) {
			min = a;
		} else if (b < a && b < c) {
			min = b;
		} else if (c < a && c < b) {
			min = c;
		}
		return min;
	}
}
