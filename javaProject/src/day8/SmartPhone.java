package day8;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String compant, String os) {
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return company+","+os;
	}
}
