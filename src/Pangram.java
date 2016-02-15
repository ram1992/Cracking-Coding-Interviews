
public class Pangram {
	
	public boolean isPangram(String str){
		
		boolean[] arr = new boolean[123];
		int count = 0;
		for(int i=0; i<str.length(); i++){
			int ascii = (int) str.charAt(i);
			if(ascii >= 65 && ascii < 123){
				arr[ascii] = true;
			}
		}
		
		for(int i = 65; i < 91; i++){
			if(arr[i] || arr[i+32])
				count++;
			else{
				System.out.println("One of the character's missing is: " + (char) i);
				return false;
			}
		}
		return true;	
	}

}
