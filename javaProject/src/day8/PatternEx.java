package day8;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-1234-5678";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("���Խİ� ��ġ�մϴ�");
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�");
		}
		data = "angel@naver.com.co.kr";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println();
		}else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�");
		}

	}

}
