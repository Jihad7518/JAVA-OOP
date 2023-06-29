package Polymorphism;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public Rectangle(String color, boolean isFilled, double length, double width) {
		super(color, isFilled);
		this.length = length;
		this.width = width;
		// TODO Auto-generated constructor stub
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Length=" + length + ", width=" + width;
	}

}
