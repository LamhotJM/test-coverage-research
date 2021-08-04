package com.lamhot.app;

public class Logic {

	public static void main(String args[]) {
		Logic logic = new Logic();
		logic.checkTurnOn(6, 8, 10);
	}

	public void checkTurnOn(int a, int b, int c) {
		// 6, 8, 10 minutes

		boolean result = false;

		int time = 0;
		int q1 = 1;
		int q2 = 1;
		int q3 = 1;

		while (result == false) {
			float val1;
			float val2;
			float val3;

			time++;

			val1 = q1 / a;
			val2 = q2 / b;
			val3 = q3 / c;

			if (q1 == a)
				q1 = 1;
			if (q2 == b)
				q2 = 1;
			if (q3 == c)
				q3 = 1;

			q1++;
			q2++;
			q3++;

			System.out.println(val1 + "  " + val2 + "  " + val3);

			if (val1 == 1 && val2 == 1 && val3 == 1) {
				result = true;
				break;

			}
		}

		System.out.println(time);

	}

}
