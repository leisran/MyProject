package com.lzq.stu.java;

public class JavaOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		System.out.println("a + b = " + (a + b)); // 30
		System.out.println("a - b = " + (a - b)); // -10
		System.out.println("a * b = " + (a * b)); // 200
		System.out.println("b / a = " + (b / a));// 2
		System.out.println("b % a = " + (b % a));// 0
		System.out.println("c % a = " + (c % a));// 5
		System.out.println("a++   = " + (a++));// 10
		System.out.println("a++��a = " + (a));// 11
		System.out.println("a--   = " + (a--));// 11
		System.out.println("a--��a = " + (a));// 10
		// �鿴 d++ �� ++d �Ĳ�ͬ
		System.out.println("d++   = " + (d++));// 25
		System.out.println("++d   = " + (++d));// 27

	}

}
