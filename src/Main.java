import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
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

		/*
		System.out.println("Enter any string to be compressed: ");
		String input = scan.next();
		StringCompress sc = new StringCompress();
		String output = sc.compress(input);
		if(!output.isEmpty()){
			System.out.println("Input given: "+input+"\n Output: "+output);
		}else{
			System.out.println("Invalid String: Empty");
		}
		
		///////////// Fibonacii (Random) /////////////
		System.out.println("Enter the required length of fibonacci series: ");
		int count = scan.nextInt();
		Fibonacci f = new Fibonacci(count);
		
		///////////// Reduce Array (Random) /////////////
	
		System.out.println("Enter the size of array: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i=0; i < size; i++){
			System.out.println("Enter "+ (i+1) + " number of the array");
			arr[i] = scan.nextInt();
		}
		
		ReduceByMin red = new ReduceByMin();
		Arrays.sort(arr);
		System.out.println(arr.length);
		red.reduce(arr);
		
		/////////////// Chocolates (Random) ////////////////
		
		System.out.println("Enter the cost of each chocolate: ");
		int cost = scan.nextInt();
		System.out.println("Enter the amount given: ");
		int amount = scan.nextInt();
		System.out.println("Enter the number of wrappers to be returned to oobtain a free chocolate: ");
		int wrappers = scan.nextInt();
		Chocolates choc = new Chocolates();		
		int output = choc.numChocolates(cost, amount, wrappers,0,0);
		System.out.println("Number of chocolates obtained: "+ output);
		
		/////////////// Encryption (Random) ////////////////
		
		System.out.println("Enter any plain text to be encrypted: ");
		String input = scan.next();
		System.out.println("Enter any number: ");
		int num = scan.nextInt();
		Encryption enc = new Encryption();
		String output = enc.encrypt(input, num%26);
		System.out.println("Given text:" + input);
		System.out.println("Encrypted text:" + output);
		
		/////////////// Pangram (Random) ////////////////
		
		System.out.println("Enter any string: ");
		String input = scan.nextLine();
		Pangram pg = new Pangram();
		boolean output = pg.isPangram(input);
		if(output){
			System.out.println("Given string " + input + " is a Pangram"); 
		}else{
			System.out.println("Given string " + input + " is not a Pangram");
		}*/
		
		//////// Number of substring occurences(Random) ///////
		
		System.out.println("Enter any string: ");
		String inputStr = scan.next();
		System.out.println("Enter any sub string: ");
		String inputSubStr = scan.next();
		NumSubString nbs = new NumSubString ();
		//int occurence = nbs.numSubString(inputStr, inputSubStr); // with out using string functions
		int occurence = nbs.numSubString2(inputStr, inputSubStr); // using string functions
		System.out.println("Number of occurences of substring "+inputSubStr+": " + occurence);
		 
	}

}