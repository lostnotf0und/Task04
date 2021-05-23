package lt.lhu.unit04.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, count = 0;

		Random rand = new Random();

		a = rand.nextInt();
		b = rand.nextInt();

		System.out.println("Два числа: " + a + ", " + b);

		int count_a = cifry(a, count);

		int count_b = cifry(b, count);

		if (count_a > count_b) {
			System.out.println("В " + a + " больше цифр (" + count_a + ") , чем в " + b + " (" + count_b + ")");
		}
		if (count_b > count_a) {
			System.out.println("В " + b + " больше цифр (" + count_b + ") , чем в " + a + " (" + count_a + ")");
		}
		else {
			System.out.println("Количество цифр в числах равно (" + count_a + ")");
		}

	}

	public static int cifry(int x, int count) {

		while (x != 0) {
			count++;
			x /= 10;
		}
		return count;
	}
}
