package day14;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer {
	private Vector handlers;
	public ChatServer(int port) {
		try {
			ServerSocket server = new ServerSocket(port);
			handlers = new Vector();
			System.out.println("ChatServer is ready");
			while(true) {
				Socket client = server.accept();
				ChatHandler c = new ChatHandler(this, client);
				c.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Object getHandler(int index) {
		return handlers.elementAt(index);
	}
	public void register(ChatHandler c) {
		handlers.add(c);
	}
	public void unregister(Object o) {
		handlers.removeElement(o);
	}
	public void broadcast(String massage) {
		synchronized (handlers) {
			int n = handlers.size();
			for(int i=0; i<n; i++) {
				ChatHandler c = (ChatHandler) handlers.elementAt(i);
				try {
					c.println(massage);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		new ChatServer(9830);
	}

	

}
