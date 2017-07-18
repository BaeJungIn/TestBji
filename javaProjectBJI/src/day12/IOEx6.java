package day12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx6 {

	public static void main (String[] args) throws IOException {
		FileOutputStream fw = new FileOutputStream(new File("C:/a.txt"));
		
		System.out.print("ют╥б:");
		int abc = 0;
		while(abc != -1) {
			abc = System.in.read();
			fw.write(abc);
		}
		fw.close();
	}
}
