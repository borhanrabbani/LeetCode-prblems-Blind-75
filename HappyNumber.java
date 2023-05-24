package neetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
	public boolean isHappy(int n) {
		if(n==1 || n==-1) {
			return true;
		}
		
		Set<Integer> visit = new HashSet<Integer>();
		
		while(!visit.contains(n)) {
			visit.add(n);
			
			n=sumOfSquare(n);
			
			if(n==1)
				return true;
		}
		
		return false;
	}
	
	private int sumOfSquare(int n) {
		int result=0;
		
		while(n!=0) {
			int left = n%10;
			left = left*left;
			result += left;	
			n= n/10;
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		HappyNumber hn = new HappyNumber();
		System.out.println(hn.isHappy(13));
	}

}
