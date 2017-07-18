package day12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IOEx7 {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter(new File("C:/a.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter fw - new PrintWriter(new FileWriter("C:/a.txt"));
		System.out.print("ют╥б: ");
		String str = "";
		while(!str.equals("end")) {
			str = in.readLine();
			fw.write(str);
			//fw.println(str);
		}
		fw.close();
	}

}
