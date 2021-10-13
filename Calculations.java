/*
 * Author: Andrin
 * 
 * 
 * Einige Simple Methoden
 */
public class Calculations {

	public static void main(String[] args) {
		//Test all three methods
		System.out.println(checksum(125));
		System.out.println(magic7(5, 2));
		System.out.println(fast12(10));
	}

	public static int checksum(int x) {
		if (x > 9) {
			return x % 10 + checksum(x / 10);
		} else {
			return x;
		}
	}

	public static boolean magic7(int a, int b) {
		if (a == 7 || b == 7) {
			return true;
		} else if (a - b == 7 || b - a == 7) {
			return true;
		} else if (a + b == 7) {
			return true;
		}
		return false;
	}

	public static boolean fast12(int z) {
		if(z%12 <=2 || z%12 >=10) {
			return true;
		}
		return false;
	}
}
