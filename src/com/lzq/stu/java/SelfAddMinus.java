package com.lzq.stu.java;
/**
 * 解析：
 * int b = ++a; 拆分运算过程为: a=a+1=4; b=a=4, 最后结果为b=4,a=4
   int d = --c; 拆分运算过程为: c=c-1=2; d=c=2, 最后结果为d=2,c=2
 * @author lzq
 *
 */
public class SelfAddMinus {
	
	public static void main(String[] args) {
		int a = 3;// 定义一个变量；
		int b = ++a;// 自增运算
		int c = 3;
		int d = --c;// 自减运算
		System.out.println("进行自增运算后的值等于" + b);
		System.out.println("进行自减运算后的值等于" + d);
	}

}
