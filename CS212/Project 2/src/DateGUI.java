import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.*;

@SuppressWarnings("serial")
public class DateGUI extends JFrame {
	
	
	public static JFrame myFrame;
	public static Container cPane;
	public static TextArea unsorted, sorted;
	
	public static void Date212GUI(DateList myList1, DateList myList2){
		myFrame.setLayout(new GridLayout(1, 2));
		cPane = myFrame.getContentPane();
		cPane.add(unsorted, BorderLayout.WEST);
		cPane.add(sorted, BorderLayout.EAST);
		   
		    	unsorted.append("Unsorted: \n\n" + myList1.toString());					//Appends the unsorted array to the left column.
		    	sorted.append("Sorted: \n\n" + myList2.toString());					//Appends the sorted array to the right column.
		      
		    myFrame.pack();
		    myFrame.setVisible(true);
		    
	}
	
	public static void initialize() {
	     
	      unsorted = new TextArea();
	      sorted = new TextArea();
	      myFrame=new JFrame();
	      myFrame.setSize(400,400);
	      myFrame.setLocation(200, 200);
	      myFrame.setTitle("Dates");
	      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	   }
	
}
