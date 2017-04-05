import java.io.File;

import javax.swing.JFileChooser;


public class LargestFile {
	
	public static File f1=null;
	
	public static void main(String[] args) {
        JFileChooser fd = new JFileChooser();
//        mode - the type of files to be displayed:
//            * JFileChooser.FILES_ONLY
//            * JFileChooser.DIRECTORIES_ONLY
//            * JFileChooser.FILES_AND_DIRECTORIES 
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showOpenDialog(null);
		File f = fd.getSelectedFile();
		listFiles(f);
		System.out.println(f1);
		System.out.print(f1.getName());
		System.out.print("...");
		System.out.print(f1.lastModified());
		System.out.print("...");
		System.out.print(f1.length());
	}
	public static void listFiles(File f) {
		File files[] = f.listFiles();
		
		for (int i = 0; i<files.length; i++) {
			File f2 = files[i];
			if(f1==null||f2.length()>f1.length())
				f1=f2;
			
            if (f2.isDirectory())
                listFiles(f2);
		}
	}
}
