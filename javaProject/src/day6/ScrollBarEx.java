package day6;

import java.awt.*;
import java.awt.event.*;

public class ScrollBarEx extends Frame implements ActionListener, AdjustmentListener{
   public Scrollbar sb_r,sb_g,sb_b;
   public TextArea ta;
   public TextField tf;
   public ScrollBarEx() {

      Panel p1 = new Panel();
      Panel p2 = new Panel();
      sb_r = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 260);
      sb_g = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 260);
      sb_b = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 260);
      setTitle("재미있는 스크롤바");
      Label la = new Label("현재색상");
      Label la1 = new Label();
      Label la2 = new Label();
      Label la3 = new Label();
      Label la4 = new Label();
      Label la5 = new Label();
      Label la6 = new Label();
      Label la7 = new Label();
      Label la8 = new Label();
      Label la9 = new Label();
     
      
      tf = new TextField();
      ta = new TextArea(20, 10);
      
      p1.setLayout(new GridLayout(10,1));
      p2.setLayout(new BorderLayout());
      this.setLayout(new GridLayout(1, 2));
      
      p1.add(la1);
      p1.add(sb_r);
      p1.add(la2);
      p1.add(sb_g);
      p1.add(la3);
      p1.add(sb_b);
      p1.add(la4);
      p1.add(la);
      p1.add(tf);
      p1.add(la5);
      
      p2.add(la6, BorderLayout.NORTH);
      p2.add(la7, BorderLayout.SOUTH);
      p2.add(la8, BorderLayout.WEST);
      p2.add(la9, BorderLayout.EAST);
      p2.add(ta, "Center");

      sb_r.addAdjustmentListener(this);
      sb_b.addAdjustmentListener(this);
      sb_g.addAdjustmentListener(this);
      
      
      add(p1,BorderLayout.WEST);
      add(p2,BorderLayout.EAST);
      setSize(300, 300);
      setLocation(700, 300);
      setVisible(true);
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
   }
   public static void main(String[] args) {
      new ScrollBarEx();
   }
@Override
public void adjustmentValueChanged(AdjustmentEvent e) {
	int r = sb_r.getValue();
	int g = sb_g.getValue();
	int b = sb_b.getValue();
	Color color = new Color(r,g,b);
	
	ta.setBackground(color);
	
	tf.setText("R: "+sb_r.getValue()+"  G: "+sb_g.getValue()+"  B: "+sb_b.getValue());
	
	
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	
	
}
}