public class StringCompress {
	
		public String compress(String str){
			if(str.isEmpty()){
				return str;
			}
			char temp = str.charAt(0);
			int count = 1;
			int len = str.length();
			StringBuffer holder = new StringBuffer();
			for(int i=1; i <len ; i++){
				char current =  str.charAt(i);
				if(current == temp){
					count ++ ;
				}else{
					holder.append(temp);
					holder.append(count);
					if(holder.length() > len)
						return str;
					temp = current;
					count = 1;
				}	
			}
			holder.append(temp);
			holder.append(count);
			if(holder.length() > len)
				return str;
			return holder.toString();
		}
		
}
