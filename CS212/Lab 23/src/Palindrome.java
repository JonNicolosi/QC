import javax.swing.JOptionPane;


public class Palindrome {
	public static void main(String[] args){
		String input=JOptionPane.showInputDialog(null,"Please enter a string");
		if(isPalindrome(input))
			JOptionPane.showMessageDialog(null,"this is palindrome");
		else JOptionPane.showMessageDialog(null,"this is not palindrome");
	}
	public static boolean isPalindrome(String input){
		int a=input.length();
		if (a==1||a==0)
			return true;
		else if(a>1){
			if(Character.isLetter(input.charAt(0))&&Character.isLetter(input.charAt(a-1)))
				if(Character.toUpperCase(input.charAt(0))==Character.toUpperCase(input.charAt(a-1)))
					return isPalindrome(input.substring(1,a-1));
				else return false;
			else if(!Character.isLetter(input.charAt(0)))
					return isPalindrome(input.substring(1));
			else if(!Character.isLetter(input.charAt(a-1)))
					return isPalindrome(input.substring(0,a-1));
			else return false;
		}
		return false;
	}
}
