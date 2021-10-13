import java.util.Scanner;

/*
 * Author: Andrin
 * 
 * 
 * Dieses Programm berechnet den GGT von zwei ganzen Zahlen.
 */
public class GGT {

	public static int euclid(int zahl1, int zahl2) {
		if (zahl1 >= zahl2 && zahl1 % zahl2 == 0) {
			return zahl2;
		}
		if (zahl2 > zahl1 && zahl2 % zahl1 == 0) {
			return zahl1;
		}
		return euclid(zahl2, zahl1 % zahl2);
	}

	public static void main(String[] args) {

		// Zwei Zahlen zum Testen
		int zahl1 = 36;
		int zahl2 = 44;

		System.out.println(euclid(zahl1, zahl2));
	}

}
