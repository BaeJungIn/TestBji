package day14;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetEx {

	public static void main(String[] args) throws UnknownHostException{
		InetAddress addr1 = InetAddress.getByName("www.naver.com");
		InetAddress addr3 = InetAddress.getLocalHost();
		System.out.println("========================");
		System.out.println("IP = "+addr1.getHostAddress());
		System.out.println("Host = "+addr1.getHostName());
		System.out.println("로컬 주소 = "+addr3.getHostAddress());
		System.out.println("로컬 이름 = "+addr3.getHostName());
	}

}
