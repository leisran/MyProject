package com.lzq.stu.java;

public class Variable {
	static int allClicks = 0; // 类变量
	String str = "hello world"; // 实例变量
	public static final double P1 = 3.1457;

	public void method() {
		int i = 0; // 局部变量
		System.out.println("局部变量: " + i);
	}

	public void pupAge() {
		int age = 0;
		age = age + 7;
		System.out.println("小狗的年龄是: " + age);
	}

	public static void main(String[] args) {
		Variable variable = new Variable();
		variable.pupAge();
		variable.method();
		System.out.println("P1: " + Variable.P1);
	}

}
