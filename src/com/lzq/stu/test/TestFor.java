package com.lzq.stu.test;

import java.util.ArrayList;
import java.util.List;

public class TestFor {

	public static void main(String[] args) {
		List<Animal> list = new ArrayList<Animal>();
		list.add(new TestFor().new Animal("Leizhongqiang", "32"));
		list.add(new TestFor().new Animal("Wuqijun", "31"));
		// 测试如何实例化内部类：
		// 首先实例化外部类
		TestFor testFor = new TestFor();
		// 把内部类当成一个成员变量进行实例化
		Animal animal = testFor.new Animal();
		animal.setName("Leishiran");
		animal.setAge("5");
		list.add(animal);
		// 1.8 a为泛型中的对象
		list.forEach(a -> {
			System.out.println("Name:" + a.getName() + " Age:" + a.getAge());
		});
		System.out.println();
		// 1.5 增强行for循环
		for (Animal a : list) {
			System.out.println("Name:" + a.getName() + " Age:" + a.getAge());
		}
		System.out.println();
		// 普通循环
		for (int i = 0; i < list.size(); i++) {
			Animal a = (Animal) list.get(i);
			System.out.println("Name:" + a.getName() + " Age:" + a.getAge());
		}
		// 2019年10月Java语言程序设计（一）填空题
		for (int i = 0, s = 0; i < 5; i++) {
			s = s + (++i);// 等价于s+=++i
			System.out.print(s);
		}
	}

	// 内部类定义
	class Animal {
		private String name;
		private String age;

		public Animal() {
		}

		public Animal(String name, String age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

	}
}
