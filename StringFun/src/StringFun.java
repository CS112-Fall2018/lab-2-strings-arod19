import java.util.Scanner;

public class StringFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String s;
		String otherString;
		String subString;
		String newString;
		
		int startIndex;
		int endIndex;
		int index;
		
		System.out.print("Input the first string, /'s/': ");
		s = scanner.nextLine();
		
		System.out.print("Input the second string, /'otherString/': ");
		otherString = scanner.nextLine();
		
		int sLength = s.length();
	
		
		System.out.println("\nLength of s String: " + sLength);
		
		System.out.println("Does s equals otherString?: " + s.equals(otherString));
		
		System.out.println("\nNow let's create a substring from your first string, s. Input the first "
				+ "index of your choice (hint: from 0 to " + (sLength - 1) + "): ");
		startIndex = scanner.nextInt();
		
		System.out.println("\nInput the last index of your choice (hint: from "+  startIndex + " to " + (sLength - 1) + "): ");
		endIndex = scanner.nextInt();
		
		subString = s.substring(startIndex, endIndex);
		
		System.out.println("\nYour new string, subString, is: " + subString);
		
		System.out.println("\nTrimmed version of your s string: " + s.trim());	
		
		System.out.println("\nInitial index of "+ subString + " in " + s + ": " +   s.indexOf(subString)); 
		
		System.out.println("\nFinal index of "+ subString + " in " + s + ": " +   s.lastIndexOf(subString)); 
		
		System.out.println("\nInput an index number and the character will be shown: (hint: from 0 to " + (sLength - 1) + "): ");
		index = scanner.nextInt();
		
		System.out.println("The character is: " + s.charAt(index));  
		
		System.out.println("\nInput a string (newString) to see if it is in the original string (s): ");
		newString = scanner.next();
		
		// .contains() returns a boolean, it is to check if "newString" is in "s".
		System.out.println("Is it on the original string?: " + s.contains(newString));
		
		// .toUpperCase returns all upper case letters of the string
		System.out.println("\nNow let's turn your original string to all upper case letters!");
		System.out.println("Here's the result: " + s.toUpperCase());
		
	}

}
