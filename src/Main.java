import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* /////// unique character 1.1 /////

		
		UniqueChar uni = new UniqueChar();
		boolean result = uni.isUniqueChar();
		if(result)
			System.out.println("String "+ str + " contain unique chars");
		else
			System.out.println("String "+str + " doesn't contain unique char");
					/////// unique character 1.1 ///// */

	///////////// Check Permutation 1.3 /////////////
		
		/*CheckPermutation cp = new  CheckPermutation();
		
		if(cp.isPermutation())
			System.out.println("Given strings are anagrams");
		else
			System.out.println("Given strings are not anagrams");
		*/
		
	///////////// Replace Character 1.4 /////////////
		
	/*	String input  = "ab cd ef";
		ReplaceChar rc = new ReplaceChar();
		String output = rc.replaceCharWith(' ', "%20", input);
		System.out.println("Input given: " + input + "\n Output: " + output); */
		
		///////////// String Compress 1.5 /////////////

		/*Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string to be compressed: ");
		String input = scan.next();
		StringCompress sc = new StringCompress();
		String output = sc.compress(input);
		if(!output.isEmpty()){
			System.out.println("Input given: "+input+"\n Output: "+output);
		}else{
			System.out.println("Invalid String: Empty");
		}*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the required length of fibonacci series: ");
		int count = scan.nextInt();
		Fibonacci f = new Fibonacci(count);
	}

}