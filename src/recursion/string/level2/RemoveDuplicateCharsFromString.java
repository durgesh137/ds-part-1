package recursion.string.level2;

/**
 * Given a string S, remove consecutive duplicates from it recursively. 1. input
 * = "aabccba", output = "abcba" 2. input = "xxxyyyzwwzzz", output = "xyzwz"
 * 
 * @author Durgesh
 *
 */
public class RemoveDuplicateCharsFromString {

	public static void main(String[] args) {
		String s = "aabccba";
//		String s = "xxxyyyzwwzzz";
		System.out.println("original string: "+s);
		System.out.println("Output: "+removeConsecutiveDuplicates(s));

	}

	/**
	 * Method removes consecutive duplicates from the input string
	 * @param s
	 * @return
	 */
	public static String removeConsecutiveDuplicates(String s) {
		if(s == null || s.length() <=1)
			return s;
		
		if(s.charAt(0) == s.charAt(1))
			return removeConsecutiveDuplicates(s.substring(1));
		else
			return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
	}
}
