package com.pratice;

public class ArrayUpperTriange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[][] a = new int[][];
		int[][] a = {{2,4,6},{1,3,5},{7,9,11}};
		for(int i=0;i<3;i++){
			for(int j =0;j<3;j++){
				if(i==0 && j==1 ||i==0&&j==2 || i==1&&j==2){
					a[i][j] = 0;
				}
				/*else if (i==0&&j==2){
					a[i][j]=0;
				}
				else if(i==1&&j==2){
					a[i][j] = 0;
				}*/
				System.out.println(a[i][j]);
			}
		}
	}

}
