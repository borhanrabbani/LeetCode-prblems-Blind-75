package com.test;

public class MatrixDiagonalSum {

	public int diagonalSum(int[][] mat) {
		int n= mat.length;
		int sum =0;
		
		for(int i=0; i<n; i++) {
			sum += mat[i][i];
			sum += mat[n-1-i][i];
		}
		
		if(n%2 !=0) {
			sum -= mat[n/2][n/2];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mat = {{1,2,3},
		               {4,5,6},
		               {7,8,9}};
		
		int [][] mat2 = {{1,1,1,1},
		                 {1,1,1,1},
		                 {1,1,1,1},
		                 {1,1,1,1}};
		
		MatrixDiagonalSum ms = new MatrixDiagonalSum();
		System.out.println(ms.diagonalSum(mat));
		System.out.println(ms.diagonalSum(mat2));
		

	}

}
