package com.lzq.stu.java;

public class TestSwitch {

	public static void main(String[] args) {
		char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("����");
			break;
		case 'B':
		case 'C':
			System.out.println("����");
			break;
		case 'D':
			System.out.println("����");
			break;
		case 'F':
			System.out.println("����Ҫ��Ŭ��Ŭ��");
			break;
		default:
			System.out.println("δ֪�ȼ�");
		}
		System.out.println("��ĵȼ��� " + grade);

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
