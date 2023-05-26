package neetcode;

public class UglyNumber {
	
	public boolean isUgly(int n) {
		
		if(n<=0) 
			return false;	
		if(n==1) {
			return true;
		}
		if(n%2==0) {
			return isUgly(n/2);
		}
		if(n%3==0) {
			return isUgly(n/3);
		}
		if(n%5==0) {
			return isUgly(n/5);
		}
		return false;
	}
	
	public boolean isUgly1(int n) {
		if( n==0) {
			return false;
		}
		
		for(int i=2; i<=5; i+=i-1) {
			System.out.println(i);    // debug purpose
			while(n%i==0) {
				n=n/i;
				System.out.println("i value: "+ i + " n: "+n); //debug purpose
			}
		}
		
		return n==1;
	}
	
	public boolean isUgly2(int n) {
		if(n<=0) {
			return false;
		}
		
		for(int p: new int[] {2,3,5}) {
			System.out.println(p);  //debugger
			while(n%p==0) {
				n=n/p;
				System.out.println("p: "+ p + " n: " + n);  //debugger 
			}
		}
		
		return n==1;
	}

	public static void main(String[] args) {
		
		UglyNumber un = new UglyNumber();
//		System.out.println(un.isUgly(10));
//		System.out.println(un.isUgly1(20));
		System.out.println(un.isUgly2(20));


	}

}
