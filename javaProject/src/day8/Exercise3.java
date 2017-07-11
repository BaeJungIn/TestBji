package day8;

import java.util.StringTokenizer;

/*
연습문제> 다음 출력 겨과가 나오도록 코드를 작성하시오.
ex1) data : "1|3.29|java"
출력결과 : 
Id : 1
Price : 3.29
Username : java
**************************

ex2) data : "2|4.345|eclipse"
출력결과 : 
Id : 2
Price : 4.345
Username : eclipse
**************************
*/

public class Exercise3 {

	public static void main(String[] args) {
		String st = "1|3.29|java";
		String str[] = {"ID","Price","Username"};
		String data = args[0];
		StringTokenizer st2;
		st2 = new StringTokenizer(st, data, false);
		
		int count = 0;
		while(st2.hasMoreTokens()) {
			for(int i=0; i<str.length; i++) {
				System.out.println(str[i]+" : "+st2.nextToken());
			}
			System.out.println();
		}
	}

}
