package day8;

public class StringSplitEx {

	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		String[] names = text.split("&|,|-");
		
		for(String name:names) {
			System.out.println(name);
		}

	}

}