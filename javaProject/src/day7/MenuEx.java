package day7;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Action;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MenuEx extends Frame implements ActionListener{

	public Frame f;
	public TextArea ta;
	public MenuBar mb;
	public Menu m;
	public Dialog  dialog;
	public Canvas can;
	public MenuItem[] mi;
	JPanel p1 = new JPanel(new BorderLayout());
	public MenuEx() {
		
		mb = new MenuBar();
		m = new Menu("File");
		mi = new MenuItem[5];
		f = new Frame();
		f.setLayout(new BorderLayout());
		f.add(p1);
		
		mi[0] = new MenuItem("New File");
		mi[1] = new MenuItem("Open File");
		mi[2] = new MenuItem("Save File");
		mi[3] = new MenuItem("Save As");
		mi[4] = new MenuItem("Exit");
		for(int i=0; i<mi.length; i++) {
			m.add(mi[i]);
			mi[i].addActionListener(this);
			if(i !=2 && i !=(mi.length-1)){
				m.addSeparator();
			}
			
			
			mi[1].setEnabled(false);
			mb.add(m);
			setMenuBar(mb);
			
		
			setLocation(250, 250);
			setSize(500,500);
			setVisible(true);
			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		}		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj.equals(mi[4])) {
			System.exit(0);
		}else if(obj.equals(mi[0])) {
			Dialog jd = new Dialog(this);
			jd.add(new Label("New File"));
			jd.pack();
			jd.setLocation(200,200);
			jd.setVisible(true);
			jd.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				jd.setVisible(false);
				jd.dispose();}
			});
		}
		
	
	}
	public static void main(String args[]) {
		new MenuEx();
	}
	
}
