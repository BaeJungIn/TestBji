package day12;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOEx5 {

	public static void main(String[] args) throws IOException{
		FileReader reader = new FileReader(new File("C:/a.txt"));
		
		while(reader.ready()) {
			char ch = (char)reader.read();
			System.out.print(ch);
		}
		reader.close();

	}

}
