package com.lzq.stu.java;

public class TestStringDemo {

	public static void main(String[] args) {
		char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b' };
		String helloString = new String(helloArray);
		System.out.println(helloString);

		String site = "www.runoob.com";
		int len = site.length();
		System.out.println("菜鸟教程网址长度 : " + len);

		System.out.println("我的名字是".concat("Runoob"));

		String string1 = "菜鸟教程网址：";
		System.out.println("1、" + string1 + "www.runoob.com");

		String a = "菜鸟教程";
		String b = "菜鸟教程";
		if (a.equals(b)) {
			System.out.println("a.equals(b)=" + a.equals(b));
		} else {
			System.out.println("a.equals(b)=" + a.equals(b));
		}
		if (a == b) {
			System.out.println("a==b：" + a.equals(b));
		} else {
			System.out.println("a==b：" + a.equals(b));
		}

		String sps = "Leizhongqiang";
		System.out.println(sps.length());
		System.out.println(sps.substring(0, 4));
	}

}
