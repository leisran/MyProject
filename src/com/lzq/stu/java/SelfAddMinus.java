package com.lzq.stu.java;
/**
 * ������
 * int b = ++a; ����������Ϊ: a=a+1=4; b=a=4, �����Ϊb=4,a=4
   int d = --c; ����������Ϊ: c=c-1=2; d=c=2, �����Ϊd=2,c=2
 * @author lzq
 *
 */
public class SelfAddMinus {
	
	public static void main(String[] args) {
		int a = 3;// ����һ��������
		int b = ++a;// ��������
		int c = 3;
		int d = --c;// �Լ�����
		System.out.println("��������������ֵ����" + b);
		System.out.println("�����Լ�������ֵ����" + d);
	}

}
