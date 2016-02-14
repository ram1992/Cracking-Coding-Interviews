
public class Encryption {

	public String encrypt(String text, int num){
		StringBuilder cipher = new StringBuilder();
		for(int i =0; i < text.length(); i++){
			char ch = text.charAt(i);
			int ascii = (int) ch;
			if(ascii >=65 && ascii<91){
				int n =ascii + num;
				if(n < 91){
					cipher.append((char) n);
				}else{
					cipher.append((char) (n - 26));
				}
				
			}else if(ascii >=97 && ascii<123){
				int n =ascii + num;
				if(n < 123){
					cipher.append((char) n);
				}else{
					cipher.append((char) (n - 26));
				}				
			}else{
				cipher.append(ch);
			}
		}
		
		return cipher.toString();
	}
}
