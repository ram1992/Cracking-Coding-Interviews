
public class Chocolates {
	
	public int numChocolates(int cost, int amount, int wrappers,int curChocCount,int curWrappers){
		curChocCount = curChocCount + (amount / cost);
		curWrappers = curWrappers + (amount / cost);
		int count = curWrappers/wrappers;
		if(count > 0){
			curChocCount = curChocCount + count;
			curWrappers = curWrappers - (count * wrappers) + count;
			return numChocolates(cost, 0, wrappers, curChocCount, curWrappers);
		}
		return curChocCount;
	}
	
}
