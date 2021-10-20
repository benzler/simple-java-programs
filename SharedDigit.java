
public class SharedDigit {
	public static void main(String[] args) {
		int a = 34;
		int b = 53;
		
		int r = -1;
		
		if(a/10 == b/10 || a/10 == b%10) {
			r= a/10;
		}else if(a%10 == b/10 || b%10 == a%10) {
			r= a%10;
		}
		
		// Der finale Wert von r wird ausgegeben
		System.out.println("a: " + a + ", b: " + b + " --> r: " + r);
	}
}
