package day6;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame{
	public JButton b1, b2, b3, b4, b5;
	public GridLayoutEx() {
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		setLayout(new GridLayout(2,3)); //레이아웃 설정
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		
		setSize(500,500);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public static void main(String[] args) {		
		new GridLayoutEx();
	}

}
