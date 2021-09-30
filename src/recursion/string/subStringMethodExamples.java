package recursion.string;

public class subStringMethodExamples {

	public static void main(String[] args) {
		String s = "xyz";
		System.out.println(s.substring(0));
		System.out.println(s.substring(1));
		System.out.println(s.substring(2));
		System.out.println(s.substring(3));//empty string returned
//		System.out.println(s.substring(4));//StringIndexOutOfBoundException
		
		System.out.println(s.substring(0,0));
		System.out.println(s.substring(0,1));
		System.out.println(s.substring(0,2));
		System.out.println(s.substring(0,3));
//		System.out.println(s.substring(0,4));//StringIndexOutOfBoundException
	}

}
