package com.lzq.stu.java;

public class TestSwitch {

	public static void main(String[] args) {
		char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("优秀");
			break;
		case 'B':
		case 'C':
			System.out.println("良好");
			break;
		case 'D':
			System.out.println("及格");
			break;
		case 'F':
			System.out.println("你需要再努力努力");
			break;
		default:
			System.out.println("未知等级");
		}
		System.out.println("你的等级是 " + grade);

		System.out.println();
		int i = 5;
		switch (i) {
		case 0:
			System.out.println("0");
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		default:
			System.out.println("default");
		}

		System.out.println();
		int k = 1;
		switch (k) {
		case 0:
			System.out.println("0");
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		default:
			System.out.println("default");
		}

		System.out.println();
		int d = 1;
		switch (d) {
		case 0:
			System.out.println("0");
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("default");
		}
	}

}
