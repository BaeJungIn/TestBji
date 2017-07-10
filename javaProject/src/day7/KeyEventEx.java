package day7;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class KeyEventEx extends JFrame implements KeyListener{
	TextArea ta;
	TextField txt;
	JButton b;
	public KeyEventEx() {
		b = new JButton("Swing Button");
		txt = new TextField();
		ta = new TextArea();
		
		add("North",txt);
		add("Center",ta);
		add("South",b);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		txt.addKeyListener(this);
	}
	public static void main(String[] args) {
		new KeyEventEx();

	}
	@Override
	public void keyPressed(KeyEvent e) {
		ta.append(e.getKeyChar()+" 가 눌림\n");
		if(e.getKeyChar()==KeyEvent.VK_SPACE){
			System.out.println("스페이스가 입력되었습니다");
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		int key = (int)e.getKeyChar();
		if(key >= 65 && key<=90) {
		
		}
		ta.append(e.getKeyChar()+" 가 입력\n");
	}

}
