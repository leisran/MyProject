package com.lzq.stu.java;

/**
 * Java ѭ���ṹ - for, while �� do...while
 * 
 * @author lzq
 *
 */
public class TestWhileForStud {

	public static void main(String[] args) {
		int x = 10;
		while (x < 20) {
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\n");
		}

		System.out.println();
		int y = 10;
		do {
			System.out.print("value of y : " + y);
			y++;
			System.out.print("\n");
		} while (y < 20);

		System.out.println();
		for (int z = 10; z < 20; z++) {
			System.out.print("value of z : " + z);
			System.out.print("\n");
		}

		System.out.println();
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int i : numbers) {
			// i ���� 30 ʱ����ѭ��
			if (i == 30) {
				break;
			}
			System.out.print(i);
			System.out.print("\n");
		}

		System.out.println();
		int[] numbers2 = { 10, 20, 30, 40, 50 };
		for (int j : numbers2) {
			// j ���� 30 ʱ����ѭ��
			if (j == 30) {
				continue;
			}
			System.out.print(j);
			System.out.print("\n");
		}
	}

}
