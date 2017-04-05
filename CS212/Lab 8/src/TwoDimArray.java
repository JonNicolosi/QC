import java.util.StringTokenizer;

public class TwoDimArray {
	public static void main(String[] args) {
		int [][]myArray = fillArray("twodimension8.txt");
		printArray(myArray);
	}
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	private static void display (int num){
		System.out.print(num+" ");
	}

	private static int[][] fillArray(String filename) {
		TextFileInput reader = new TextFileInput(filename);
		
		String line = reader.readLine();
		StringTokenizer tokens = new StringTokenizer(line, ",");
		
		int rows = Integer.parseInt( tokens.nextToken() );
		int cols = Integer.parseInt( tokens.nextToken() );
		
		int [][]returnArray =  new int[rows][cols];
		
		for (int i=0; i<rows; i++) {
			line = reader.readLine();
			tokens = new StringTokenizer(line, ",");
			for (int j=0; j<cols;j++) {
				returnArray[i][j] = Integer.parseInt( tokens.nextToken() );
			}
		}
		
		return returnArray;
	}
}
