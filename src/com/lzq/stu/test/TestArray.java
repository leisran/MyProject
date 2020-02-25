package com.lzq.stu.test;

public class TestArray {

	public static void main(String[] args) {
		// 数组定义
		int[] a1 = new int[5];
		int a2[] = new int[5];
		int[] b = { 0, 1, 2, 3, 4 };
		int b1[] = { 0, 1, 2, 3, 4 };
		// 二维数据定义
		int c1[][] = new int[4][];
		int[][] c2 = new int[4][];
		int[] c3[] = new int[10][10];
		System.out.println(a1.length);// 5
		System.out.println(a2.length);// 5
		System.out.println(b.length);// 5
		System.out.println(b1.length);// 5
		System.out.println(c1.length);// 4
		System.out.println(c2.length);// 4
		System.out.println(c3.length);// 10
	}
}
