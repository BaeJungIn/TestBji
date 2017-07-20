package day14;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements Runnable, ActionListener{
	private BufferedReader i;
	private PrintWriter o;
	private JTextArea output;
	private List list;
	private JTextField input;
	private JLabel label;
	private Thread listener;
	private String host;
	private JScrollPane js;
	ChatHandler ch;
	ChatServer server;
	
	
	public ChatClient(String server) {
		super("채팅 프로그램");
		host = server;
		listener = new Thread(this);
		listener.start();
		output = new JTextArea();
		js = new JScrollPane(output);
		
		Panel p1 = new Panel(new GridLayout(1, 2));
		list = new List();
		p1.add(js);
		p1.add(list);
		output.setEditable(false);
		Panel bottom = new Panel(new BorderLayout());
		label = new JLabel("사용자 이름");
		bottom.add(label, "West");
		input = new JTextField();
		input.addActionListener(this);
		bottom.add(input, "Center");
		
		add(p1,"Center");
		add(bottom,"South");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object c = e.getSource();
		if(c == input) {
			label.setText("메시지");
			o.println(input.getText());
			input.setText("");
		}
		
	}

	@Override
	public void run() {
		try {
			Socket s = new Socket(host, 9830);
			InputStream ins = s.getInputStream();
			OutputStream os = s.getOutputStream();
			i = new BufferedReader(new InputStreamReader(ins));
			o = new PrintWriter(new OutputStreamWriter(os), true);
			
			
			while(true) {

				String line = i.readLine();
				output.append(line+"\n");
				js.getVerticalScrollBar().setValue(js.getVerticalScrollBar().getMaximum());
				

			}
			
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		if(args.length>0) {
			new ChatClient(args[0]);
		}else {
			new ChatClient("localhost");
		}

	}
	

}
