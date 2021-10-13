/*
 * Author: Andrin
 * 
 * 
 * Dieses Programm gibt den eingegebenen Namen als in einem Quadrat angeordnete Scrabble-Steine aus.
 */
public class Scrabble {

	public static void main(String[] args) {
		String name = "Alfred";
		String nameUppercase = name.toUpperCase();
		drawNameSquare(nameUppercase);
	}

	public static void keinStein() {
		System.out.print("     ");
	}

	public static void steinRand() {
		System.out.print("+---");
	}

	public static void steinRandEnde() {
		System.out.print("+");
	}

	public static void neueZeile() {
		System.out.println("");
	}

	public static void steinMitte(char buchstabe) {
		System.out.print("| " + buchstabe + " ");
	}

	public static void abstand(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print("     ");
		}
	}

	public static void steinRandZeile(int length) {
		for (int i = 0; i < length; i++) {
			steinRand();
		}
		steinRandEnde();
		neueZeile();
	}

	public static void nameLines(String name, int length, String usedFor) {
		steinRandZeile(length);
		for (int i = 0; i < length; i++) {
			if (usedFor == "first") {
				steinMitte(name.charAt(i));
			} else {
				steinMitte(name.charAt(length - 1 - i));
			}
		}
		System.out.println("|");
		steinRandZeile(length);
	}

	public static void middleLines(char links, char rechts, int length, int index) {
		if (index != 1) {
			steinRand();
			System.out.print("+");
			abstand(length - 3);
			steinRand();
			System.out.print("+");
			System.out.println("");
		}

		System.out.print("| " + links + " |");
		abstand(length - 3);
		System.out.print("| " + rechts + " |");
		System.out.println("");
	}

	public static void drawNameSquare(String name) {
		int length = name.length();
		nameLines(name, length, "first");
		for (int i = 1; i < length - 1; i++) {
			middleLines(name.charAt(i), name.charAt(length - i - 1), length, i);
		}
		nameLines(name, length, "last");

	}

}
