import java.awt.*;

import javax.swing.*;


public class DateGUI extends JFrame {

	public static Container cPane;
	public static TextArea unsorted, sorted;
	public JMenuBar menuBar  = new JMenuBar();
	public JFrame frame = new JFrame("Dates");

	public DateGUI(UnsortedDateList myList1, SortedDateList myList2) {
		
		createFileMenu();			//Initializes the File menu.
		unsorted = new TextArea();
	    sorted = new TextArea();
	    
		frame.setSize(500,500);
		frame.setLocation(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(1, 2));
		
		cPane = frame.getContentPane();
		cPane.add(unsorted, BorderLayout.WEST);
		cPane.add(sorted, BorderLayout.EAST);
    	
    	frame.setVisible(true);	
	}
	
	private void createFileMenu() {
	      JMenuItem   item;
	      
	      JMenu  fileMenu = new JMenu("File");
	      FileMenuHandler fmh  = new FileMenuHandler(this);
	      item = new JMenuItem("Open");    //Open...
	      item.addActionListener( fmh );
	      fileMenu.add( item );

	      fileMenu.addSeparator();           //add a horizontal separator line
	    
	      item = new JMenuItem("Quit");       //Quit
	      item.addActionListener( fmh );
	      fileMenu.add( item );

	      frame.setJMenuBar(menuBar);
	      menuBar.add(fileMenu);
	    
	   } //createMenu
	
	

} //SSNGUI

