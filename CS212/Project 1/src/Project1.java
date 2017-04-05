import javax.swing.*;

import java.awt.*;
import java.util.StringTokenizer;
public class Project1{
   
   static TextFileInput inFile;
   public static StringTokenizer Tokens;
   public static String[] TokenArray;				//Raw tokens in a string array.
   public static String[] TokenArrayClean;			//String array with only legal dates.
   public static String[] TokenArrayCleanSorted;	//String array with dates sorted.
   static String inFileName = "project1dates.txt";
   static JFrame myFrame;
   static Container cPane;
   static TextArea unsorted, sorted;
   
   public static void main(String[] args) {
      initialize();									//Initializes the JFrame.
      readNumbersFromFile(inFileName);				
      print(TokenArrayClean, TokenArrayCleanSorted);
   }   
   public static void initialize() {
      inFile = new TextFileInput(inFileName);
      unsorted = new TextArea();
      sorted = new TextArea();
      myFrame=new JFrame();
      myFrame.setSize(400,400);
      myFrame.setLocation(200, 200);
      myFrame.setTitle("");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void print(String[] s, String[] x){	//Gets the sorted array and unsorted array from readNumbersFromFile.
	   myFrame.setLayout( new GridLayout(1, 2) );
	   cPane = myFrame.getContentPane();
	   cPane.add(unsorted, BorderLayout.WEST);
	   cPane.add(sorted, BorderLayout.EAST);
	   
	   for (int c=0; c<s.length;c++){
	    	unsorted.append(s[c]+"\n");					//Appends the unsorted array to the left column.
	    	sorted.append(x[c]+"\n");					//Appends the sorted array to the right column.
	      }
	   myFrame.pack();
	      myFrame.setVisible(true);
   }
   
   public static String[] selectionSort(String[] s) {
	   for (int i = s.length - 1; i >= 1; i--){
		   String  currentMax = s[0];
		   int currentMaxIndex = 0;
		   for (int j = 1; j <= i; j++) {
			   if (currentMax.compareTo(s[j]) < 0) {
				   currentMax = s[j];
				   currentMaxIndex = j;
			   }
		   }
		   if (currentMaxIndex != i) {
			   s[currentMaxIndex] = s[i];
			   s[i] = currentMax;
		   }
	   }
	   return s;
	   }

   public static void readNumbersFromFile(String fileName){

      String line;
      line = inFile.readLine();
      for(int a = 0;a<11;a++)												//This loop reads each line of the text file into String line.
      line = inFile.readLine() + "," + line;
      
      Tokens = new StringTokenizer(line,", ");								
      TokenArray = new String[Tokens.countTokens()];
      
      int i=0;									
      while (Tokens.hasMoreTokens()) {										//This loop reads each token of String line into an array of strings.	
         TokenArray[i]=Tokens.nextToken();
         i++;
      }
      
      int digitcounter = 0;
      
      for(int a = 0; a<TokenArray.length; a++){								//This loop iterates through TokenArray, finds legal dates, and counts how 
    	  int counter = 0;													//many there are so that we know how large TokenArrayClean needs to be.
    	  for(int b = 0; b<TokenArray[a].length(); b++){
    		  if(Character.isDigit(TokenArray[a].charAt(b))==true){
    			  counter++;
    		  }
    			  if(counter==TokenArray[a].length()&&TokenArray[a].length()==8){
    				  digitcounter++;
    			  }
    		  }
    	  }
      
      for(int a = 0; a<TokenArray.length; a++){								//This loop iterates through TokenArray, finds alphabetic strings, and prints
    	  int lettercounter = 0;											//them to the console.
    	  for(int b = 0; b<TokenArray[a].length(); b++){
    		  if(Character.isAlphabetic(TokenArray[a].charAt(b))==true){
    			  lettercounter++;
    		  }
    			  if(lettercounter==TokenArray[a].length()){
    				  System.out.println(TokenArray[a]);
    			  }
    		  }
    	  }
      
      TokenArrayClean = new String[digitcounter];
      
      int digitcounter2 = -1;	
      int digitcounter3 = -1;
      
      for(int a = 0; a<TokenArray.length; a++){								//This loop copies all legal dates from TokenArray to TokenArrayClean.
    	  int counter2 = 0;
    	  digitcounter3++;
    	  for(int b = 0; b<TokenArray[a].length(); b++){
    		  if(Character.isDigit(TokenArray[a].charAt(b))==true){
    			  counter2++;
    			  if(counter2==TokenArray[a].length()&&TokenArray[a].length()==8){
    				  digitcounter2++;
    				  TokenArrayClean[digitcounter2]=TokenArray[digitcounter3];
    			  }
    		  }
    	  }
      }
      
      TokenArrayCleanSorted = new String[digitcounter];
      
      for(int j = 0; j<TokenArrayClean.length;j++){		//Copies TokenArrayClean, which is comprised of unsorted legal dates, to a new array to be sorted.
    	  TokenArrayCleanSorted[j]=TokenArrayClean[j];
      }
      
      selectionSort(TokenArrayCleanSorted);				//Passes unsorted array to selectionSort to be sorted in proper order.
      
      
   } //readNumbersFromFile
   
} //Project1

