package neetcode;

public class PalindromeNumber {
	
	public boolean isPalindrome(int x) {
		if(x<0 || x%10==0) {
			return false;
		}
		
		int div=1;
		
		while(x>=div*10) {
			div=div*10;
		}
		
		while(x>0) {
			int right = x%10;
			int left = x/div;
			
			if(right!=left) {
				return false;
			}
			
			x= (int)((x%div)/10);
			div=div/100;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromeNumber pn = new PalindromeNumber();
		System.out.println(pn.isPalindrome(121));
		
	}

}
