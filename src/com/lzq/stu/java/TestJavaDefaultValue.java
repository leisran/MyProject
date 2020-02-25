package com.lzq.stu.java;

public class TestJavaDefaultValue {
	final double PI = 3.1415927;
	// Java各个类型的默认值
	static boolean bool = false;
	static byte by = 0;
	static char ch = '\u0000';
	static double d = 0.0d;
	static float f = 0.0f;
	static int i = 0;
	static long l = 0L;
	static short sh = 0;
	static String str = null;

	public static void main(String[] args) {
		System.out.println("Bool :" + bool);
		System.out.println("Byte :" + by);
		System.out.println("Character:" + ch);
		System.out.println("Double :" + d);
		System.out.println("Float :" + f);
		System.out.println("Integer :" + i);
		System.out.println("Long :" + l);
		System.out.println("Short :" + sh);
		System.out.println("String :" + str);
	}

}
