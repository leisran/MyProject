package com.lzq.stu.test;

import java.util.ArrayList;
import java.util.List;

public class TestFor {

	public static void main(String[] args) {
		List<Animal> list = new ArrayList<Animal>();
		list.add(new TestFor().new Animal("Leizhongqiang", "32"));
		list.add(new TestFor().new Animal("Wuqijun", "31"));
		// �������ʵ�����ڲ��ࣺ
		// ����ʵ�����ⲿ��
		TestFor testFor = new TestFor();
		// ���ڲ��൱��һ����Ա��������ʵ����
		Animal animal = testFor.new Animal();
		animal.setName("Leishiran");
		animal.setAge("5");
		list.add(animal);
		// 1.8 aΪ�����еĶ���
		list.forEach(a -> {
			System.out.println("Name:" + a.getName() + " Age:" + a.getAge());
		});
		System.out.println();
		// 1.5 ��ǿ��forѭ��
		for (Animal a : list) {
			System.out.println("Name:" + a.getName() + " Age:" + a.getAge());
		}
		System.out.println();
		// ��ͨѭ��
		for (int i = 0; i < list.size(); i++) {
			Animal a = (Animal) list.get(i);
			System.out.println("Name:" + a.getName() + " Age:" + a.getAge());
		}
		// 2019��10��Java���Գ�����ƣ�һ�������
		for (int i = 0, s = 0; i < 5; i++) {
			s = s + (++i);// �ȼ���s+=++i
			System.out.print(s);
		}
	}

	// �ڲ��ඨ��
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
