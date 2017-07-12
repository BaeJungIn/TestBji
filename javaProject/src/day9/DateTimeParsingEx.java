package day9;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeParsingEx {
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
      LocalDateTime dateTime = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30);
      String formattedDateTime = dateTime.format(formatter);
      System.out.println(formattedDateTime);
      
      formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH/mm");
      dateTime = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30);
      formattedDateTime = dateTime.format(formatter);
      System.out.println(formattedDateTime);
      
      formattedDateTime = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30).format(DateTimeFormatter.ofPattern("yyyy.MM.dd HH.mm"));
      System.out.println(formattedDateTime);
      
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");
      System.out.println(sdf.format(new Date()));
      
      sdf = new SimpleDateFormat("yyyy.MM.dd HH.mm");
      System.out.println(sdf.format(new Date()));
   }
}