package com.sapient;

public class MultiDimArray {

	public static void main(String[] args) {
		
		int[] num;
		num= new int[5];
		
		int[] num1;
		num1=new int [5];
		
		num[0]=5;
		num[1]=4;
		num[2]=3;
		for(int data:num1)
			System.out.println(data);
		System.arraycopy(num, 0, num1, 1, 3);
		for(int data:num1)
			System.out.println(data);
		// TODO Auto-generated method stub

	}

}
