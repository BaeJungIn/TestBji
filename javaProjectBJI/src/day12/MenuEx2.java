package day12;

import java.awt.Canvas;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JLabel;

public class MenuEx2 extends Frame implements ActionListener{
   public MenuBar mb;
   public Menu m;
   public Dialog dialog;
   public Canvas can;
   private MenuItem[] mi;
   FileReader reader;
   TextArea ta;

   public MenuEx2() {
      // TODO Auto-generated constructor stub
      mb = new MenuBar();
      m = new Menu("File");
      mi = new MenuItem[5];
      ta = new TextArea();
      mi[0] = new MenuItem("New File");
      mi[1] = new MenuItem("Open File");
      mi[2] = new MenuItem("Save File");
      mi[3] = new MenuItem("Save As");
      mi[4] = new MenuItem("Exit");
      for(int i = 0; i<mi.length; i++) {
         m.add(mi[i]);
         mi[i].addActionListener(this);
         if(i!=2&&i!=(mi.length-1))
            m.addSeparator();
      }
      mi[1].setEnabled(true);
      mb.add(m);
      setMenuBar(mb);
      add(ta);
      setLocation(250, 250);
      setSize(500, 500);
      setVisible(true);
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            // TODO Auto-generated method stub
            System.exit(0);
         }
      });
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      Object obj = e.getSource();
      if(obj.equals(mi[4])) {
         System.exit(0);
      }else if(obj.equals(mi[0])) {
         ta.setText(" ");
        
      }else if(obj.equals(mi[1])) {
         FileDialog fd = new FileDialog(this, "열기", FileDialog.LOAD);
         fd.setVisible(true);
         String dir = fd.getDirectory();
         String file = fd.getFile();
         
         ta.setText(" ");
         
         //StringBuilder sb = new StringBuilder();
         System.out.println(dir+", "+file);
         try {
            reader = new FileReader(new File(dir+"/"+file));
            while(reader.ready()) {
               char ch = (char)reader.read();
               //sb.append(ch);
               ta.append(ch+"");
            }
            //ta.append(sb.toString());
            reader.close();
         } catch (Exception ex) {
            // TODO: handle exception
            ex.printStackTrace();
         }
      }else if(obj.equals(mi[2])) {
         FileDialog fd = new FileDialog(this, "저장", FileDialog.SAVE);
         fd.setVisible(true);
         
         String dir = fd.getDirectory();
         String file = fd.getFile();
         
         //ta.setText(" ");
         try {
        	 FileWriter fw = new FileWriter(new File(dir+"/"+file));
        	 fw.write(ta.getText());
        	 fw.close();
		} catch (Exception e2) {
			
		}
      }else if(obj.equals(mi[3])) {
         FileDialog fd;
         dialog = new Dialog(this);
         dialog.setSize(100, 100);
         setLayout(new FlowLayout());
         dialog.add(new JLabel("Save As"));
         dialog.setLocation(250, 250);
         dialog.pack();
         dialog.setVisible(true);
         dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               // TODO Auto-generated method stub
               dialog.setVisible(false);
               dialog.dispose();
            }
         });
      }
   }
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      new MenuEx2();
   }
}