package day7;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class DialogEx extends JFrame{
	public Cust[] list;
	public JButton button;
	public Dialog dialog;

	String id;
	String pw;
	Member member;
	Scanner scan= new Scanner(System.in);
	
	
	public DialogEx() {
		button = new JButton("새창");
		dialog = new MyDialog(this);
		dialog.pack();
		
		setLayout(new FlowLayout());
		add(button);
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DialogEx();
	}

}

class Cust{
	private String id;
	private String pw;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
class MyDialog extends JDialog implements ActionListener{
	protected Cust cust;
	public JTextField id;
	public JPasswordField pw;
	public JButton login, cancel;
	public MyDialog(JFrame frame) {
		super(frame);
		cust =  new Cust();
		cust.setId("abc");
		cust.setPw("123");
		id = new JTextField();
		pw = new JPasswordField("취소");
		JPanel p_left = new JPanel(new GridLayout(2, 1));
		JPanel p_right = new JPanel(new GridLayout(1, 2));
		JPanel p_center = new JPanel(new GridLayout(2, 1));
		JPanel p_bottom = new JPanel(new GridLayout(1, 2));
		p_left.add(new JLabel("ID:"));
		p_right.add(new JLabel("PW:"));
		p_center.add(id);
		p_center.add(pw);
		p_bottom.add(login);
		p_bottom.add(cancel);
		login.addActionListener(this);
		cancel.addActionListener(this);
		setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object event = e.getSource();
		boolean result = false;
		if(event == login) {
			if(id.getText().equals(cust.getId())) {
				if(pw.getText().equals(cust.getPw())) {
					result = true;
				}else {
					
				}
			}else {
				
			}
		System.out.println(result ? "성공!!!" : "실패");
		}else if(event == cancel) {
			id.setText(cust.getId());
		}
		
	}
}
