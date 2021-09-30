package recursion.string;

/**
 * Write a recursive function to convert a given string into the number it represents. 
 * That is input will be a numeric string that contains only numbers, 
 * you need to convert the string into corresponding integer and return the answer.

 * @author Durgesh
 *
 */
public class StringToInteger {

	public static void main(String[] args) {
//		String input = "1234";
		String input = "00001231";
		System.out.println("Original string: "+input);
		System.out.println("Integer: "+convertStringToInt(input));

	}

	/**
	 * 
	 * @param input
	 * @return
	 */
	public static int convertStringToInt(String input) {
		int value = 0;
		
		//check if string input length is 0
		if(input == null || input.length() == 0 )
			return 0;
		
		//input length is 1
		if(input.length() == 1)
			return input.charAt(0) - '0'; //1
		
		//input length is minimum 2
		//recursive call with string from index 0 till last, excluding the last character
		int restNum = convertStringToInt(input.substring(0, input.length() - 1));//1

		//converting character at last index to integer
		int num = input.charAt(input.length() -1) - '0';//4
		return restNum * 10 + num;
		
	}
}

/**
This approach ***reduces effective input string length with each recursive call**( to operate on with each step
______________ALGORITHM to convert String to integer______________
1. check if input is null or input length is 0, return 0
2. check if input length is 1, return character at index 0 - '0', to get the integer value.
3. Make a recursive call to function having input parameter as substring from index 0 till input length -1,
store the result in prevNum.
4. convert character at index 0, to integer value and store in num variable.
5. multiply prevNum with 10 and add it with num value, and return it. 
*/