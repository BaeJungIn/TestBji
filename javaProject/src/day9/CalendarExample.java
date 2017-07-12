package day9;

import java.util.*;

public class CalendarExample {

	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);                
		int month = cal.get(Calendar.MONTH) + 1;          
		int day = cal.get(Calendar.DAY_OF_MONTH);     
		
		int week = cal.get(Calendar.DAY_OF_WEEK);        
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "��";
				break;
			case Calendar.TUESDAY:
				strWeek = "ȭ";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "��";
				break;
			case Calendar.THURSDAY:
				strWeek = "��";
				break;
			case Calendar.FRIDAY:
				strWeek = "��";
				break;
			case Calendar.SATURDAY:
				strWeek = "��";
				break;
			default:
				strWeek = "��";
		}
		
		int amPm  = cal.get(Calendar.AM_PM);   
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		
		int hour    = cal.get(Calendar.HOUR);                 
		int minute  = cal.get(Calendar.MINUTE);             
		int second  = cal.get(Calendar.SECOND);              

		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.println(day + "�� ");
		System.out.print(strWeek + "���� ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "�� ");
		System.out.print(minute + "�� ");
		System.out.println(second + "�� ");
		

		
		year = 2016;
		month=7;
		cal.set(year, month-1,1);
		int startDay = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i=1; i<lastDay+startDay; i++) {
			if(i<startDay) {
			System.out.print("\t");
			continue;
			}
		System.out.print((i-startDay+1)+"\t");
		if(i%7 ==0) {
			System.out.println();
		}
		}
	}
}

