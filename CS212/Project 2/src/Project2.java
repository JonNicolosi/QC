import java.util.StringTokenizer;

/**
 * @author Jon
 *	The Project 2 class contains the main method and the readDatesFromFile method which employs StringTokenizer to read the dates from project2.txt and put them in an array.
 *	The elements in DateArray are then passed to Date212 to check for validity before being appended to myList1 and inserted into myList2 in the main method.
 *	The main method is also responsible for initializing the GUI.
 */
public class Project2 {

	static String inFileName = "project2.txt";
	
	public static void main(String[] args){
		
		DateGUI.initialize();										//Initializes JFrame in DateGUI.java.
		DateList myList1= new DateList();							//Creates new DateList object.
		DateList myList2= new DateList();							//Creates new DateList object.
		readDatesFromFile(inFileName, myList1, myList2);			//Calls method readDatesFromFile which uses StringTokenizer to tokenize dates in project2.txt and put them in their
																	//respective lists.
		
		DateGUI.Date212GUI(myList1, myList2);						//Passes myList1 and myList2 to the Date212GUI method in the DateGUI class.
	
	}
	
	public static void readDatesFromFile(String filename, DateList myList1,DateList myList2) {
		TextFileInput in = new TextFileInput(filename);
		String line = in.readLine();
		String date;
		while(line != null) {
		    StringTokenizer myTokens = new StringTokenizer(line, ",");
		       while(myTokens.hasMoreTokens()) {
		    	  date = myTokens.nextToken();
		    	     Date212 date212 = new Date212(date);	   
			         myList1.append(date212);
			         myList2.insert(date212);
		    	  }   
		          	
			line = in.readLine();
		}
		return;
	}
}