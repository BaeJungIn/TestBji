package day6;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AWTEx2 extends JFrame{
	public JButton b1, b2, b3, b4, b5;
	public AWTEx2() {
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		setLayout(new BorderLayout()); //레이아웃 설정
		add(b1 ,"Center");
		add(b2,"East");
		add(b3, BorderLayout.NORTH);
		add(b4, BorderLayout.SOUTH);
		add(b5, BorderLayout.WEST);
		setSize(500,500);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
	}
	public static void main(String[] args) {		
		new AWTEx2();
	}

}
