import java.util.Scanner;

/*
 * Author: Andrin
 * 
 * 
 * Dieses Programm gibt die Binaerdarstellung einer positive Zahl aus, ohne Arrays oder String-
 * Operationen.
 */
public class Binaer {
	public static long power(long x, long y) {
		if (y == 0)
			return 1;
		else {
			long answer = 1;
			for (int i = 1; i <= y; i++) {
				answer *= x;
			}
			return answer;
		}
	}

	public static int getBiggestPowerOf2(int input) {
		int counter = 0;
		while (power(2, counter) * 2 <= input) {
			counter++;
		}
		return counter;
	}

	public static void getBinary(int quotient) {
		for (int i = (getBiggestPowerOf2(quotient)); i >= 0; i--) {
			if (quotient - power(2, i) >= 0 && quotient != 0) {
				quotient -= power(2, i);
				System.out.print("1");
			} else {
				System.out.print("0");
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input lesen
		int input = scanner.nextInt();
		if (input >= 0) {
			getBinary(input);
		} else {
			System.out.println("Bitte nur positive Zahlen eingeben.");
		}

		// Loop zum testen
//		for (int i = 100; i >= 0; i--) {
//			System.out.println(Integer.toBinaryString(i));
//			getBinary(i);
//			System.out.println("");
//		}

	}

}
