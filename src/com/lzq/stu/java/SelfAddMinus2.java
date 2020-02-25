package com.lzq.stu.java;

public class SelfAddMinus2 {

	public static void main(String[] args) {
		int a = 5;// 定义一个变量；
		int b = 5;
		int x = 2 * ++a;
		int y = 2 * b++;
		System.out.println("自增运算符前缀运算后a=" + a + ",x=" + x);
		System.out.println("自增运算符后缀运算后b=" + b + ",y=" + y);

		int i = 10;
		int j = 20;
		System.out.println("i == j = " + (i == j));
		System.out.println("i != j = " + (i != j));
		System.out.println("i > j = " + (i > j));
		System.out.println("i < j = " + (i < j));
		System.out.println("j >= i = " + (j >= i));
		System.out.println("j <= i = " + (j <= i));
		System.out.println("1 << 2 = " + (1 << 2));
		System.out.println("1 >> 2 = " + (1 >> 2));
	}

}
