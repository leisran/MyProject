package com.lzq.stu.java;

public class TestIfElse {

	public static void main(String[] args) {
		int x = 10;
		if (x < 20) {
			System.out.print("���� if ���");
		}

		System.out.println();
		int y = 30;
		if (y < 20) {
			System.out.print("���� if ���");
		} else {
			System.out.print("���� else ���");
		}

		System.out.println();
		int z = 30;
		if (z == 10) {
			System.out.print("Value of Z is 10");
		} else if (z == 20) {
			System.out.print("Value of Z is 20");
		} else if (z == 30) {
			System.out.print("Value of Z is 30");
		} else {
			System.out.print("���� else ���");
		}

		System.out.println();
		int i = 30;
		int j = 10;
		if (i == 30) {
			if (j == 10) {
				System.out.print("I = 30 and J = 10");
			}
		}

	}

}
