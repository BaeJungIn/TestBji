package day11;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class Test extends Frame implements Runnable, MouseListener{
	
	int x=0;
	int y=20;
	boolean xOrient, yOrient;
	
	public Test(String str) {
		super(str);
		setSize(300,200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void paint(Graphics gr) {
		Random ran = new Random();
		Dimension d = this.getSize();
		Toolkit tk = Toolkit.getDefaultToolkit();
		int r = ran.nextInt(255);
		int g = ran.nextInt(255);
		int b = ran.nextInt(255);
		gr.setColor(new Color(r,g,b));
		gr.drawRect(x,y,20,20);
		
		if(xOrient) {
			x--;
			if(x<0) {
				tk.beep();
				x=0; xOrient = false;
			}
		}else {
			x++;
			if(x>=d.width-20) {
				tk.beep();
				x=d.width-20;
				xOrient = true;
			}
		}
		if(yOrient) {
			y--;
			if(y<0) {
				tk.beep();
				y=0;
				yOrient = false;
			}
		}else {
			y++;
			if(y>=d.height-20) {
				tk.beep();
				y=d.height-20;
				yOrient = true;
			}
			
		}
		
		
		}
	public void update(Graphics g) {
		paint(g);
	}
	@Override
	public void run() {
		while(true) {
			repaint();
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Test thread = new Test("ThreadRectDraw");
		Thread t1 = new Thread(thread);
		t1.start();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
