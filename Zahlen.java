
/*
 * Author: Andrin
 * 
 * 
 * Dieses Programm liest einen String ein, der eine Siebensegmentanzeige kodiert, und gibt die kodierte Zahl als Integer aus.
 */
public class Zahlen {
	public static int getZahl(String input) {
		if (input == "abcdef") {
			return 0;
		} else if (input == "bc") {
			return 1;
		} else if (input == "abdeg") {
			return 2;
		} else if (input == "abcdg") {
			return 3;
		} else if (input == "bcfg") {
			return 4;
		} else if (input == "acdfg") {
			return 5;
		} else if (input == "acdefg") {
			return 6;
		} else if (input == "abc") {
			return 7;
		} else if (input == "abcdefg") {
			return 8;
		} else if (input == "abcdfg") {
			return 9;
		} else
			return 0;
	}

	public static void main(String[] args) {

		// Input
		String input = "abcdef";

		System.out.println(getZahl(input));
	}

}
