package com.lzq.stu.test;

public class Test {
	public static void main(String[] args) {
		int x = 1, y = 2, z = 3;
		System.out.println(x == 0 || x < y && z > y);// true
		int[][] j = { { 1, 2 }, { 3 }, { 4, 5, 6 } };
		System.out.println(j[1].length);// 1
		String s = "java";
		s = s.concat(s);
		System.out.println(s);
		// ��д��ʹ��for��䣬������м��ܹ���3����Ҳ�ܹ���5��������λ��
		for (int i = 100; i < 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println(Test.maxnumDigit(12340));

	}
	//����int maxnumDigit(int n)�Ĺ��������ʮ��������n��λ�����ֵ�����磬n=12340���÷����ķ���ֵ��4
	static int maxnumDigit(int n){
		int max = 0, d;
		while (n > 0) {
			d = n % 10;
			if (d > max)
				max = d;
			n = n / 10;
		}
		return max;
	}
}
