package com.javacode_01stApril_2023;

public class Retrival_2D_Arrays {

	public static void main(String[] args) {
		int[][] a = {{10,20,30,40},{11,21,31,41},{12,22,32,42}};
		
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
