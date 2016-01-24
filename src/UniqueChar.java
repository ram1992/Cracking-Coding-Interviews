import java.util.Scanner;


/////////// unique character 1.1 ////////////////
class UniqueChar {
	
	public boolean isUniqueChar(){
		
		System.out.println("Enter any string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		if(str.length() > 256)
			return false;
		
		boolean[] charSet = new boolean[256];
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i);
			if(charSet[val])
				return false;
			charSet[val] = true;
		}
		return true;
	}
	
}
