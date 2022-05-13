package com.test;

public class BuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = { 7, 6, 5, 1, 3, 2 };

		int maxProfit = 0;

		// Brute Force solution
		/*
		 * for(int i=0; i<prices.length-1; i++) { int temp1 = prices[i];
		 * 
		 * for(int j=i+1; j<prices.length; j++) { int temp2 = prices[j]-temp1;
		 * if((temp2)>maxProfit){ maxProfit = temp2; } } }
		 */

		// Optimized solution
		int minPrice = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else if ((prices[i] - minPrice) > maxProfit) {
				maxProfit = (prices[i] - minPrice);
			}
		}

		System.out.println(maxProfit);

	}

}
