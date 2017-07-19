package bank;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class BankDial1 extends JDialog implements ActionListener{
	protected BankCust cust;
	public Panel pa1;
	public Label lb1, lb2, lb3, lb4, lb5,lb6,lb7;
	public JTextField name_jt, pw_jt, number_jt;
	public JButton join_b, cancel_b;

	public BankDial1(BankMain frame) {
		setTitle("계좌등록");
		pa1 = new Panel(new GridLayout(6, 2));
		lb1 = new Label("아이디");
		lb2 = new Label("패스워드");
		lb3 = new Label("");
		lb4 = new Label("");
		lb5 = new Label("");
		lb6 = new Label("");
		lb7 = new Label("계좌 입력");
		name_jt = new JTextField();
		pw_jt = new JTextField();
		number_jt = new JTextField();
		join_b = new JButton("등록");
		cancel_b = new JButton("취소");
		
		pa1.add(lb3);
		pa1.add(lb5);
		pa1.add(lb1);
		pa1.add(name_jt);
		pa1.add(lb2);
		pa1.add(pw_jt);
		pa1.add(lb7);
		pa1.add(number_jt);
		pa1.add(lb4);
		pa1.add(lb6);
		pa1.add(join_b);
		pa1.add(cancel_b);
	
		add(pa1);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == join_b) {
			
		}else if(obj == cancel_b) {
			
		}
		
		
	}
}
