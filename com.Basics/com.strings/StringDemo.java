public class StringDemo {
	public static void main(String[] args) {
		String myString = new String("Hello World");
		String myString1="Hello World";
		
		// Some useful String methods
		System.out.println(myString.length()); //This method returns the length of a string.
		System.out.println(myString1.charAt(4)); //This method returns the character at a specified index in a string.
		System.out.println(myString1.substring(0, 5)); //This method returns a substring of a string, based on a starting and ending index.
		System.out.println(myString1.codePointAt(2)); // This method returns the ASCII value of the character at a specified index in a string.
		System.out.println(myString1.compareToIgnoreCase(myString)); //This method compares two strings lexicographically, ignoring case differences.
		System.out.println(myString1.replace("l", "L"));
		System.out.println(myString1);
		
		//Strings in java are immutable(once created cannot be altered)
		
	}
}
