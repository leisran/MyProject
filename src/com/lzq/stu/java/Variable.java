package com.lzq.stu.java;

public class Variable {
	static int allClicks = 0; // �����
	String str = "hello world"; // ʵ������
	public static final double P1 = 3.1457;

	public void method() {
		int i = 0; // �ֲ�����
		System.out.println("�ֲ�����: " + i);
	}

	public void pupAge() {
		int age = 0;
		age = age + 7;
		System.out.println("С����������: " + age);
	}

	public static void main(String[] args) {
		Variable variable = new Variable();
		variable.pupAge();
		variable.method();
		System.out.println("P1: " + Variable.P1);
	}

}
