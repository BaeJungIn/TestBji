package day7;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxEx extends Frame implements ItemListener{
	Frame fr;
	Panel p1,p2, p3;
	TextArea ta;
	Checkbox ch1, ch2, ch3, ch4, ch5, ch6;
	Choice cho;
	Label lb;
	CheckboxGroup ch;
	
	public CheckBoxEx() {
		
		fr = new Frame();
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		ta = new TextArea();
		lb = new Label("");
	
		fr.setLayout(new BorderLayout());
		p1.setLayout(new GridLayout(2,1));
		p2.setLayout(new BorderLayout());
		p3.setLayout(new BorderLayout());
		
		new CheckboxGroup();
		ch1 = new Checkbox("��ħ",true,ch);
		ch2 = new Checkbox("����",false,ch);
		ch3 = new Checkbox("����",false,ch);
		
		ch4 = new Checkbox("���",false);
		ch5 = new Checkbox("����",false);
		ch6 = new Checkbox("��",false);
		
		cho = new Choice();
	
		cho.add("��ħ");
		cho.add("����");
		cho.add("����");
		
		p1.add(ch1,"Center"); 
		p1.add(ch2,"Center");
		p1.add(ch3,"Center");
		p1.add(lb,"Center");
		p1.add(ch4,"Center");
		p1.add(ch5,"Center");
		p1.add(ch6,"Center");
		
		p2.add(ta,"Center");
		
		p3.add(cho,"Center");
		
		add(p1,"North");
		add(p2,"Center");
		add(p3,"South");
		
		setSize(500,500);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		Object obj = e.getSource();
				
				if(obj ==cho) {
					String st = cho.getSelectedItem();
					if(st.equals("��ħ")) {
						ch1.setState(true);
					}else if(st.equals("����")) {
						ch2.setState(true);
					}else if(st.equals("����")) {
						ch3.setState(true);
					}
				}
		
			Checkbox temp = ch.getSelectedCheckbox();
			
		ta.setText("<<"+temp.getLabel()+">>\n\n");
		ta.append("1. ��� : "+ch4.getState()+"\n");
		ta.append("2. ���� : "+ch5.getState()+"\n");
		ta.append("3. �� : "+ch6.getState()+"\n");
		
		
		cho.select(temp.getLabel());
	}

}
