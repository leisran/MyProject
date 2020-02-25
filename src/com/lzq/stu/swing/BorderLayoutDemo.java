package com.lzq.stu.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Java������GUI����"); // ����Frame����
		frame.setSize(400, 200);
		frame.setLayout(new BorderLayout()); // ΪFrame�������ò���ΪBorderLayout
		JButton button1 = new JButton("��");
		JButton button2 = new JButton("��");
		JButton button3 = new JButton("��");
		JButton button4 = new JButton("��");
		JButton button5 = new JButton("��");
		frame.add(button1, BorderLayout.NORTH);
		frame.add(button2, BorderLayout.WEST);
		frame.add(button3, BorderLayout.CENTER);
		frame.add(button4, BorderLayout.EAST);
		frame.add(button5, BorderLayout.SOUTH);
		frame.setBounds(300, 200, 600, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
