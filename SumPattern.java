
public class SumPattern {
	
	public static void outputMoeglich(int a, int b, int c) {
			System.out.println("Moeglich. "+ a + " + " + b + " == " + c);
	}
	
	public static void outputUnmoeglich() {
		System.out.println("Unmoeglich.");
}
	
	
	public static void main(String[] args) {
		// Aendern Sie die Werte um verschiedene Ausfuehrungen zu testen.
		int a = 10;
		int b = 11;
		int c = 1;
		
		if(a + b == c) {
			outputMoeglich(a,b,c);
		}else if(a + c == b) {
			outputMoeglich(a,c,b);
		}
		else if(b + c == a) {
			outputMoeglich(b,c,a);
		}
		else {
			outputUnmoeglich();
		}
	}	
}
