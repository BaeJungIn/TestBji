package day6;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


public class ExerciseEx1 extends Frame{
	TextArea ta;
	TextField tf;
	Label la;
	Scrollbar sc1, sc2, sc3;
	Label lb1,lb2,lb3,lb4,lb5;
	
	public Label[] lab;
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	GridLayout grid1, grid2;
	Frame f;
	
	public ExerciseEx1() {
		lab = new Label[9];
		for(int i=0; i<lab.length; i++) {
			lab[i] = new Label("");
		}
		setLayout(new GridLayout(1,2));

		f = new Frame();
		ta = new TextArea(30,30);
		sc1 = new Scrollbar(Scrollbar.HORIZONTAL);
		sc2 = new Scrollbar(Scrollbar.HORIZONTAL);
		sc3 = new Scrollbar(Scrollbar.HORIZONTAL);
		tf = new TextField();
		la = new Label("현재 색상");
		lb1 = new Label("");
		lb2 = new Label("");
		lb3 = new Label("");
		lb4 = new Label("");
		grid1 = new GridLayout(1,2);
		grid2 = new GridLayout(10,1);

		p1.setLayout(new BorderLayout());
		
		p1.add("West",lab[0]);
		p1.add("Center",ta);
		p1.add("East",lab[1]);
		p1.add("North",lab[2]);
		p1.add("South",lab[3]);
		
		p2.setLayout(new GridLayout(10,1));
		p2.add(lab[4]);
		p2.add(lb3);
		p2.add(lab[5]);
		p2.add(lb2);
		p2.add(lab[6]);
		p2.add(lb4);
		p2.add(tf);
		p2.add(lab[7]);
		
		
		
		
		setSize(500,550);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExerciseEx1();
	}

}
