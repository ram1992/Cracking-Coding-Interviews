
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

	///////////// Check Permutation /////////////
		
		/*CheckPermutation cp = new  CheckPermutation();
		
		if(cp.isPermutation())
			System.out.println("Given strings are anagrams");
		else
			System.out.println("Given strings are not anagrams");
		*/
		
		String input  = "ab cd ef";
		ReplaceChar rc = new ReplaceChar();
		String output = rc.replaceCharWith(' ', "%20", input);
		System.out.println("Input given: " + input + "\n Output: " + output);
	}

}