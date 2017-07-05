package day3;

import java.util.Scanner;

public class ConstructorEx2 {
	public ConstructorEx2() { // 2 , 4 출력
		this(50,"홍길동"); //멤버
		Scanner sc = new Scanner(System.in);
		System.out.println("Constructor!!");
	}
	ConstructorEx2(int a){
		System.out.println("Constructor!!"+ a);
	}
	public ConstructorEx2(int a, String s) { // 3 출력 (2 가져와서)
		System.out.println("Constructor!!"+ s);
	}
	public static void main(String[] args) {
		System.out.println("Constructor Test");
		new ConstructorEx2(); // 1 출력
	}
}
