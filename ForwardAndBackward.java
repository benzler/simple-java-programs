public class ForwardAndBackward {
	public static String centerOutput(String output, int ANZLINES) {
		while(output.length()/2 < ANZLINES) {
			output = " " + output + " ";
		}
		return output;
	}
    
    public static void main(String[] args) {
    	int ANZLINES = 6;
    	char FORWARDSCHARCODE = 47;
    	char BACKWARDSCHARCODE = 92;
    	boolean center = true;
    	
    	for (int i = 1; i <= ANZLINES; i++) {
    		boolean isAscending = i <= ANZLINES/2;
    		int anzSigns;
    		String output = "";
    		
    		if(isAscending) {
    			anzSigns = i;
    		}else {
    			anzSigns = ANZLINES + 1 -i;
    		}
    		
    		for (int j = 0; j < anzSigns; j++) {
      		  	output = BACKWARDSCHARCODE + output + FORWARDSCHARCODE;
      		}
    		if(center) {
    			output = centerOutput(output, ANZLINES);
    		}
    		System.out.println(output);
    	}
    }
}
