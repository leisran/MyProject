package com.lzq.stu.java;

public class Struct {

	public static void main(String[] args) {
		int[] intArr = { 23, 31, 46, 54, 58, 67, 72, 88 };
		int i = 5;
		int j=0;
		for (j= intArr.length - 1; j >= i - 1; j--)
			intArr[j + 1] = intArr[j];
		intArr[i - 1] = 56;
		System.out.println(intArr.length);
	}

}
