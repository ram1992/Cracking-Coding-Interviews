//0 1 1 2 3 5 8 13...
public class Fibonacci {
	static int f1 = 0, f2 = 1, f3= 0;
	
	public Fibonacci(int count){
		if(count == 1 ){
			System.out.print("0");
		}else if(count == 2){
			System.out.print("0, 1 ");			
		}else{
			System.out.print("0, 1 ");
			calculate(count -2);
		}
	}
	
	public static void calculate(int num){
		if(num  > 0){
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.print(", "+f3);
			calculate(num-1);
		}
	}
}
