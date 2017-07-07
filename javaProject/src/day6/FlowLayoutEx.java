package day6;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame{
	public JButton b1, b2, b3;
	public FlowLayoutEx() {
		setSize(500,500);
		setLocation(1000, 500); //띄울때
		setVisible(true);
		b1 = new JButton("버튼1");
		b2 = new JButton("버튼2");
		b3 = new JButton("버튼3");
		setLayout(new FlowLayout()); //레이아웃 설정
		add(b1);
		add(b2);
		add(b3);
		
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {		
		new FlowLayoutEx();
	}

}
