import java.util.*;


public class CheckPermutation {

		public boolean isPermutation(){
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter String 1: ");
			String str1 = scan.next();
			System.out.println("Enter String 2: ");
			String str2 = scan.next();
			
			if(str1.isEmpty() && str2.isEmpty())
				return true;
			
			int len1 = str1.length();
			int len2 = str2.length();
			
			if (len1 != len2)
				return false;
			
			int[] letters = new int[256];
			
			char s1[] = str1.toCharArray();
			
			for(char c:s1){
				letters[c]++;
			}
		
			for(int i=0 ; i< str2.length(); i++){
				int c = (int) str2.charAt(i);
				if(--letters[c] <0)
					return false;
			}
			
			return true;
			/*
			HashMap<Character,Integer> h1 = new HashMap<Character,Integer>();
			HashMap<Character,Integer> h2 = new HashMap<Character,Integer>();
			
			for(int i=0; i< len1; i++){
				Character val = str1.charAt(i);
				if(h1.containsKey(val))
					h1.put(val, h1.get(val)+1);
				else
					h1.put(str1.charAt(i), 1);
				
				val = str2.charAt(i);
						
				if(h2.containsKey(val))
					h2.put(val, h2.get(val)+1);
				else
					h2.put(val, 1);
			}
			
			Set s = h1.entrySet();
			Iterator i = s.iterator();
			
			while(i.hasNext()){
				Map.Entry me = (Map.Entry) i.next();
				if(me.getValue() != h2.get(me.getKey()))
					return false;
			}
					
			return true;
		}*/
	}
}
