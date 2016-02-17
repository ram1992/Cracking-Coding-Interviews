
public class NumSubString {

	public int numSubString(String inputStr, String inputSubStr) {
		// without using string functions
		int len =inputSubStr.length();
		int occurence = 0;
		for(int i = 0; i < inputStr.length(); i++){
			if(inputStr.charAt(i) == inputSubStr.charAt(0)){
				int count = 0;
				int j = 0;
				int k;
				for(j = i,k=0; k < len; j++,k++){
					if(inputStr.charAt(j) == inputSubStr.charAt(k))
						count++;
					else
						break;
				}
				if(count == len){
					occurence++;
					i = j-1;
				}
			}
		 }
		 return occurence;
	}

	public int numSubString2(String inputStr, String inputSubStr) {
		// using string functions
		int occurence = 0, index = 0, len = inputSubStr.length();
		
		while(index != -1){
			index = inputStr.indexOf(inputSubStr, index);
			if(index != -1){
				occurence++;
				index = index + len;
			}				
		}
		
		return occurence;
	}

}
