import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;
public class FileMenuHandler implements ActionListener {
   JFrame jframe;
   public static UnsortedDateList myList1= new UnsortedDateList();			//Creates new UnsortedDateList object.
   public static SortedDateList myList2= new SortedDateList();				//Creates new SortedDateList object.
   public FileMenuHandler (JFrame jf) {
      jframe = jf;
   }
   public void actionPerformed(ActionEvent event) {
      String  menuName;
      menuName = event.getActionCommand();									//Assigns the action that the user performs to menuName.
      if (menuName.equals("Open"))											//If the user clicks "Open", open the selected file.
         openFile(); 
      else if (menuName.equals("Quit"))										//If the user clicks "Quit", close the window.
         System.exit(0);
   } //actionPerformed

    private void openFile( ) {
       JFileChooser chooser;
       int status;
       chooser = new JFileChooser( );
       status = chooser.showOpenDialog(null);
       if (status == JFileChooser.APPROVE_OPTION) 
          readDatesFromFile(chooser.getSelectedFile());						//Passes the selected file to readDatesFromFile.
       else 
          JOptionPane.showMessageDialog(null, "Open File dialog canceled");
    } //openFile
  
    public static void readDatesFromFile(File chosenFile) {
    	String chosenFileName = chosenFile.getName();						//Gets the name of the file so that TextFileInput can parse the data.
		TextFileInput in = new TextFileInput(chosenFileName);
		String line = in.readLine();
		String date;
		while(line != null) {
		    StringTokenizer myTokens = new StringTokenizer(line, ",");
		       while(myTokens.hasMoreTokens()) {
		    	  date = myTokens.nextToken();
		    	  try{														
		    	     Date212 date212 = new Date212(date);	   
			         myList1.add(date212);
			         myList2.insert(date212);
		    	  }
		    	  catch(Exception e){										//Catches any IllegalDate212Exceptions thrown by Date212.
		    		  System.out.println(date);
		    	  }
		       }   
		          	
			line = in.readLine();
		}
        	DateGUI.unsorted.append("Unsorted: \n\n" +myList1.toString());	//Appends the unsorted array to the left column.
        	DateGUI.sorted.append("Sorted: \n\n" +myList2.toString());		//Appends the sorted array to the right column.
		return;
	}
}