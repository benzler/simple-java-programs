
public class AbsoluteMax {
	
	public static void main(String[] args) {
		// Aendern Sie die Werte um verschiedene Ausfuehrungen zu testen.
		int a = 7;
		int b = -5;
		int c = 3;
		
		int absA = Math.abs(a);
		int absB = Math.abs(b);
		int absC = Math.abs(c);
		
		int maxAB = absA > absB ? absA : absB;
		int r = maxAB > absC ? maxAB : absC;
		
		// Der finale Wert von r wird ausgegeben
		System.out.println("a: " + a + ", b: " + b + ", c: " + c + " --> r: " + r);
	}
}
