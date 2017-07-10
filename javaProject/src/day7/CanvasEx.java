package day7;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CanvasEx extends Canvas implements ActionListener{
	public Frame f;
	public Image img;
	public Button b,c,d,h;
	public int x,y;
	public Panel pn1;

	public CanvasEx() {
		pn1 = new Panel();
		
		x = 10; y = 10;
		b = new Button("¢π");
		c = new Button("¢∑");
		d = new Button("°‰");
		h = new Button("°‚");
		Toolkit tool = Toolkit.getDefaultToolkit();
		img = tool.getImage("C:\\Users\\odae\\Desktop\\dd\\dog.jpg");
		
		f = new Frame("Canvas Test");
		f.add(pn1);
		
		pn1.setLayout(new GridLayout(2,3));
		pn1.add(this, "Center");
		pn1.add(new Label(""));
		pn1.add(b);
		pn1.add(new Label(""));
		pn1.add(c);
		pn1.add(d);
		pn1.add(h);

		
		f.setSize(500,500);
		f.setVisible(true);

		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		h.addActionListener(this);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public void paint(Graphics g) {
		//g.drawRect(x,y, 10, 10);
		g.drawImage(img, x, y, this);
		g.drawString("≥ª ¿Ã∏ß¿∫ ∏€∏€¿Ã¿‘¥œ¥Ÿ", 10,200);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CanvasEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(b == obj) {
			x++;
			repaint();
		}else if(c == obj) {
			x--;
			repaint();
		}else if(d == obj) {
			y++;
			repaint();
		}else if(h == obj) {
			y--;
			repaint();
		}
	
		
	}

}
