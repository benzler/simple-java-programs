import java.util.Scanner;

/*
 * Author: Andrin
 * 
 * 
 * Dieses Programm berechnet die Reihe 1/1^2 + 1/2^2 + ... + 1/N^2
 */
public class Reihe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input lesen
		int inputInt = scanner.nextInt();

		float sum = 0;
		for (int i = 1; i <= inputInt; i++) {
			sum += (float) 1 / (i * i);
		}
		System.out.println(sum);
	}

}
