/*
 * Printing a swiss flag with a variable size.
 * 
 * Author: Andrin
 * 
 */
public class SwissFlag {
	
	public static String[][] getBorder(String[][] output){
		int height = output.length;
		int width = output[0].length;
		for(int i=0; i< height; i++) {
			output[i][0] = "|";
			output[i][width-1] = "|";	
		}
		for(int i=0; i< width; i++) {
			output[0][i] = "-";
			output[height-1][i] = "-";	
		}
		return output;
	}
	
	public static String[][] makeRectangle(String[][] output,int startx, int starty, int width, int height){
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				output[startx+i][starty+j] = "+";
			}
		}
		return output;
	}
	
	public static String[][] getCross(String[][] output){
		int height = output.length;
		int width = output[0].length;
		int widthOfCross = width/5;
		int heightOfCross = height/5;
		
		int schmalerRand = height/2 - heightOfCross*3/2;
		int breiterRand = width/2 - widthOfCross/2;
		output = makeRectangle(output,schmalerRand,breiterRand,widthOfCross, heightOfCross*3);
		
		schmalerRand = width/2 - widthOfCross*3/2;
		breiterRand = height/2 - heightOfCross/2;
		output = makeRectangle(output,breiterRand,schmalerRand,widthOfCross*3, heightOfCross);
		
		return output;
	}
	
	public static void printFlag(String[][] output) {
		int height = output.length;
		int width = output[0].length;
		for(int i=0; i< height; i++) {
			for(int j=0; j< width; j++) {
				if(output[i][j]!= null) {
					System.out.print(output[i][j]);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
	//INPUTS:
	int HEIGHT = 15; //Breite in Zeichen
	
	
	int WIDTH = HEIGHT* 2;
	String[][] output = new String[HEIGHT][WIDTH];
	
	output = getBorder(output);
	output = getCross(output);
	
	printFlag(output);
	}
}
