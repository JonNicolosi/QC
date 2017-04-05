import javax.swing.*;

public class Project0 {
	
	public static void main(String[] args){
		String inputSentence;
		
		while(true){//Causes the prompt to loop infinitely until the user intervenes.
		
		inputSentence = JOptionPane.showInputDialog(null, "Enter a word or phrase: ");
		int counter = 0;
		if (inputSentence.equals("STOP")){//Causes the program to exit when the user types STOP.
			System.exit(0);
		}
		for (int i = 0; i<inputSentence.length(); i++){	//This for loop will iterate through the characters of the string entered by 
														//the user. The loop will stop when it has looped for an amount of times equal
														//to the length of the string.
			
			char c1 = inputSentence.charAt(i);	//Assigns the current character in the loop to a variable so that it can be compared 
												//to the previous character.
			
			if (i>0 && c1==inputSentence.charAt(i-1) && inputSentence.charAt(i-1)!=' '){//The condition i>0 ensures that the condition
				counter++;																//c1==inputSentence.charAt(i-1) will not go
			}																			//out of range. The condition 
																						//c1==inputSentence.charAt(i-1)checks if the
		}																				//previous character is the same as the current
																						//character. Finally, inputSentence.charAt(i-1)!=' '
																						//ensures that a space between two identical
																						//letters does not qualify as consecutive letters (e.g "kook kook").
		
		JOptionPane.showMessageDialog(null, "There are " + counter + " pairs of letters.");
		
		}
	
	
	}
}

