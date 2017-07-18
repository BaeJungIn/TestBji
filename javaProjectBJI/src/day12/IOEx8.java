package day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IOEx8 {
   public static void main(String[] args) throws IOException{
      // TODO Auto-generated method stub
      File file = new File("C:/a.txt");
      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw, true); //오토플러쉬 flush();
      
      InputStream is = System.in;
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader in = new BufferedReader(isr);
      
      System.out.print("입력: ");
      String str = "";
      while(! str.equals("end")) {
    	  str = in.readLine();
    	  pw.println(str);
      }
         pw.close();
         in.close();
   }
}
