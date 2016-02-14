import java.util.Arrays;


public class ReduceByMin {

	
	public void reduce(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				System.out.println(arr.length-i-1);
			}
		}
		/*int length = arr.length;
		int min = 0;
		while(i < length){
			if(arr[i] != 0){
				min = arr[i];
				break;
			}	
			i++;
		}
		if(i < length){
			for(int j = i; j < length; j++){
				arr[j] = arr[j] - min;//////
				System.out.print(arr[j] + " ");
			}
			System.out.println((length - i));
			reduce(arr, i);
		}*/
		
	}

}
