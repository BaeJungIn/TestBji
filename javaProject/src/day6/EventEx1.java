package day6;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventEx1 extends Frame implements ActionListener, AdjustmentListener{
	Button b1, b2;
	Scrollbar sb;
	Checkbox ch;
	
	public EventEx1() {
		b1 = new Button("버튼1");
		b2 = new Button("버튼2");
		sb = new Scrollbar(0,0,5,0,260);
		ch = new Checkbox("라벨",true);
		add(b1,"West");
		add(b2,"East");
		add(sb,"Center");
		add(ch,"North");
		b1.addActionListener(this);
		sb.addAdjustmentListener(this);
		ch.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				System.out.println("이벤트 발생"+ch.getLabel());
			}
		});
		setSize(300,300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new EventEx1();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Button obj = (Button)e.getSource();
		
		if(obj==b1)
		System.out.println("이벤트 발생"+obj.getLabel());
		
	}
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO Auto-generated method stub
		System.out.println("이벤트 발생"+sb.getValue());
	}
}

	
	

