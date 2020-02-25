package com.lzq.stu.test;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestSwing extends JFrame {
	private static final long serialVersionUID = -9125462080581230864L;
	private JFrame frame;
	private JButton btn1, btn2, btn3;

	public static void main(String[] args) {
		TestSwing t = new TestSwing();
		t.go();
	}

	void go() {
		btn1 = new JButton("North");
		btn2 = new JButton("Center");
		btn3 = new JButton("South");
		frame = new JFrame("Buttons");
		Container con = frame.getContentPane();
		con.add(btn1, BorderLayout.NORTH);
		con.add(btn2, BorderLayout.CENTER);
		con.add(btn3, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
}
