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
		
		System.out.println("Input a string (newString) to see if it is in the original string (s): ");
		newString = scanner.next();
		
		System.out.println("Is it on the original string?: " + s.contains(newString));
		
		System.out.println("Now let's turn your original string to all upper case letters!");
		System.out.println("Here's the result: " + s.toUpperCase());
		/*
		1. In a static main method, take as a command line argument three strings: s, otherString, 
		and subString.  
		Note: if you want spaces in your String you have to use quotes around the argument,
		 for example, “This string has spaces in it.”

		2. Performs all 7 of the methods listed in #1 above on PLUS the two additional ones that you pick

		3. Prints out the results of each method.

		4. Make sure to add javadoc for the StringFun class  Explain in the Class comment  what two methods you picked and in your own words what each method does.

		5. Create a doc sub-directory and then generate the javadoc with the command (run from your main working directory)

		javadoc -d doc -version -author *a
		
		
		
		s.length() done 
s.equals(otherString) done

s.substring(startIndex, endIndex)
s.trim()
s.indexOf(subString) 
s.lastIndexOf(subString)
s.charAt(index)
		*/

	}

}
