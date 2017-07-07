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
		setLocation(1000, 500); //��ﶧ
		setVisible(true);
		b1 = new JButton("��ư1");
		b2 = new JButton("��ư2");
		b3 = new JButton("��ư3");
		setLayout(new FlowLayout()); //���̾ƿ� ����
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
