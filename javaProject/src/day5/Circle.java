package day5;

public class Circle extends Shape{

	protected int r;
		
	public Circle() {
		r = 0;
	}
	public Circle(int r) {
		this.r = r;
	}
	
	public int setRadius() {
		return r;
	}
	public int getRadius() {
		return r;
	}
	@Override
	public double area() {
		return Math.PI*r*r;
	}
	@Override
	public double circumference() {
		return Math.PI*r*2;
	}
	
}
