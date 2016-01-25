
public class ReplaceChar {
	
	public String replaceCharWith(char str,String replace, String input){
		int length = input.length();
		int replaceLength = replace.length();
		String output="";
		int spaceCount = 0;
		for(int i=0; i< length; i++){
			if(input.charAt(i) == ' ')
				spaceCount++;
		}
		int newLength = length + spaceCount * (replaceLength-1);
	    char[] inputArray = new char[newLength];
		for(int i=0; i< length; i++){
			inputArray[i] = input.charAt(i);
		}
		
		for(int i = length - 1; i >= 0; i--){
			if(inputArray[i] == ' '){
				for(int j = replaceLength-1; j >=0 ; j--){
					inputArray[newLength-replaceLength+j] = (char) replace.charAt(j);
					//System.out.println(inputArray[newLength-replaceLength+j]);
				}
				newLength = newLength - replaceLength;  
			}else{
				inputArray[newLength - 1] = inputArray[i];
				//System.out.println(inputArray[newLength-1]);
				newLength = newLength - 1;
			}
		}
		
		return new String(inputArray);
	}
}
