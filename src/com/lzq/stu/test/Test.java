package com.lzq.stu.test;

public class Test {
	public static void main(String[] args) {
		int x = 1, y = 2, z = 3;
		System.out.println(x == 0 || x < y && z > y);// true
		int[][] j = { { 1, 2 }, { 3 }, { 4, 5, 6 } };
		System.out.println(j[1].length);// 1
		String s = "java";
		s = s.concat(s);
		System.out.println(s);
		// 请写出使用for语句，输出所有既能够被3整除也能够被5整除的三位数
		for (int i = 100; i < 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println(Test.maxnumDigit(12340));

	}
	//方法int maxnumDigit(int n)的功能是求出十进制整数n各位的最大值。例如，n=12340，该方法的返回值是4
	static int maxnumDigit(int n){
		int max = 0, d;
		while (n > 0) {
			d = n % 10;
			if (d > max)
				max = d;
			n = n / 10;
		}
		return max;
	}
}
