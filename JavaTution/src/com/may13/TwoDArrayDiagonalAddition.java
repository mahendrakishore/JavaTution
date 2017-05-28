package com.may13;

public class TwoDArrayDiagonalAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{2,4,6},{1,3,5},{7,9,11}}; int sum = 0 ;
		for(int i = 0 ; i<3;i++){
			for(int j=0;j<3;j++){
				if(i==j){
					sum = sum+a[i][j]; 
				}
			}
			}
		System.out.println("the diagonal addition"+sum);
		}
	}


